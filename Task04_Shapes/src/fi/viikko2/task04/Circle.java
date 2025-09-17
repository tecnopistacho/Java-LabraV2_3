/**
 * Tehtävä 4 – Circle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kenttä radius.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Area = Math.PI * r * r.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) { 
        this.radius = radius;
     }

    @Override
    public double area(){ 
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){ 
        return "Circle";
    }

    @Override
    public boolean equals(Object o){ 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle other = (Circle) o;
        return Double.compare(this.radius, other.radius) == 0;
        // Double.compare(a, b) compares two double valaues and handles edge cases
        // This avoids problems that can happen with == when comparing floating-point numbers
    }
}