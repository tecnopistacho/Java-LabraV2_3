/**
 * Tehtävä 1 – Main (testaa Person)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo muutama Person-olio taulukkoon.
 *  2. Kutsu birthday() ja tulosta.
 *  3. Testaa equals kahdella identtisellä oliolla.
 *
 * VINKIT:
 *  - Skeleton heittää UnsupportedOperationExceptioneja kunnes toteutat metodit.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 1: implementoi Person ja poista kommentit testausta varten.");
        // Person[] people = { new Person("Ada",19), new Person("Linus",30), new Person("Ada",19) };
        // System.out.println(people[0].equals(people[2]));
        // System.out.println(people[0].birthday());
        // System.out.println(people[0]);

        // 1. Create a few Person objects in an array.
        Person [] people = {new Person("Juan", 40), new Person("Maria", 35), new Person("Juan", 40)};
        // 2. Call birthday() and print.
        System.out.println(people[0].birthday());
        // 3. Test equals with two identical objects.
        System.out.println(people[2].equals(people[0]));
    }
}