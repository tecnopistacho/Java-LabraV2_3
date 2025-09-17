/**
 * Tehtävä 6 – Vehicle (paketointi ja näkyvyys)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. protected String brand; int mileage (package-private).
 *  2. Konstruktori ja getBrand().
 *  3. toString().
 *
 * VINKIT:
 *  - protected näkyy aliluokille eri paketissa; package-private ei.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task06.model;

public class Vehicle {
    protected String brand;
    // protected: allows access from subclasses, even it they're in different packages

    int mileage;    // (package-private in java means no modifier - just: int mileage;)
                    // This allows access within the same package but not from outside or from subcclasses in other packages

    public Vehicle(String brand, int mileage){
        this.brand = brand;
        this.mileage = mileage;
    }
    
    public String getBrand(){
        return brand;
    }

    @Override
    public String toString(){
        return "Vehicle";
    }
}

// 'SportsCar' is in a different package, it:
    // can access 'brand', because it is protected
    // can NOT access 'mileage', because it is package-private
    // This is why we pass 'mileage' to 'super(...)' but doesn't use it directly