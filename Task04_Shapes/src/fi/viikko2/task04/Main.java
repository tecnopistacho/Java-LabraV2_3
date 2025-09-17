/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        // Array of shapes
        Shape[] shapes = {
            new Rectangle(5.0, 3.0),
            new Circle(2.0),
            new Rectangle(4.0,4.0),
            new Circle(1.5)
        };

        // Calculate total area
        double totalArea = 0.0;
        for (Shape s : shapes) {
            System.out.println(s.toString() + " area: " + s.area());
            totalArea += s.area();
        }

        // Print total area
        System.out.println("Total area of all shapes: " + totalArea);
    }
}