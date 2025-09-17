/**
 * Tehtävä 6 – SportsCar (eri paketti, perii Vehicle)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Vehicle.
 *  2. Kenttä horsepower.
 *  3. Konstruktori kutsuu yliluokan konstruktoria, super(...).
 *  4. toString() käyttää brand-kenttää (protected).
 *
 * VINKIT:
 *  - Älä käytä mileagea täällä: se on package-private (eri paketti).
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task06.sub;

import fi.viikko2.task06.model.Vehicle;

public class SportsCar extends Vehicle { // inherits from Vehicle (extends)
    private double horsepower;

    public SportsCar(String brand, int mileage, double horsepower){
        super(brand, mileage); // calls Vehicle constructor
        this.horsepower = horsepower;
    }
   
    @Override
    public String toString(){ 
        return "SportsCar brand: " + brand + ", horsepower: " + horsepower;
    }
}