/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");

        // Test Employee.java
        Employee e1 = new Employee("Pilar");
        Employee e2 = new Employee("Pilar");
        Employee e3 = new Employee("Ana");

        System.out.println(e1.equals(e2));  // true
        System.out.println(e1.equals(e3));  // false
        System.out.println(e1);             //Employee

        // Create an array of Employee objects and calculate total monthly payroll
        Employee[] employees = {
            new HourlyEmployee("Pilar", 15.0, 160),
            new HourlyEmployee("Ana", 20.0, 120),
            new Employee("Lazy"),
            new SalariedEmployee("Mari", 3000.0)
        };
        // Calculate salary sum
        double totalSalary = 0.0;
        for (Employee e : employees){
            System.out.println(e.toString() + " " + e.name + " earns: " + e.monthlyPay());
            totalSalary += e.monthlyPay();
        }

        // Print Total
        System.out.println("Total monthly payroll: " + totalSalary);
    }
}