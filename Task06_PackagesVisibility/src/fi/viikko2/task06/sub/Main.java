/**
 * Tehtävä 6 – Main (näkyvyysdemo)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Vehicle ja SportsCar.
 *  2. Tulosta ne.
 *  3. Kokeile kommentoituna mileage-käyttöä (pitää antaa virhe).
 *
 * VINKIT:
 *  - Kirjoita selittävä kommentti näkyvyydestä.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task06.sub;

import fi.viikko2.task06.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 6: implementoi Vehicle ja SportsCar, huomioi näkyvyydet.");

        // Object creation 'Vehicle' and 'SportsCar' using their constructors
        Vehicle v = new Vehicle("Generic", 10000);
        SportsCar sc = new SportsCar("FastBrand", 2000, 450);
        
        // Print out objects - This calls each object's 'toString()' method
        System.out.println("Vehicle: " + v);
        System.out.println("SportsCar: " + sc);
        
        // Accessing 'mileage' from outside its package will cause a c compile-time error.
            // sc.mileage = 500;   // EI KÄÄNNY: mileage on package-private eri paketissa
            // v.mileage = 12000;  // EI KÄÄNNY: sama syy

        // The field mileage in the Vehicle class has package-private visibility,
        // which means it can only be accessed from classes in the same package as Vehicle.
        // Since SportsCar and Main are ina different package/folder ('sub'), they cannot access mileague. 
        // SportsCar is a subclass of Vehicle. Only protected fields are accessible in subclasses across packages.
    }
}