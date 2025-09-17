/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double area(){
        return width * height; 
     }

    @Override
    public String toString() {
        return "Rectangle"; 
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true; // same object
        if (o == null || getClass() != o.getClass()) return false; // null or wrong

        Rectangle other = (Rectangle) o;
        return Double.compare(this.width, other.width) == 0 &&
        Double.compare(this.height, other.height) == 0;
    }
}