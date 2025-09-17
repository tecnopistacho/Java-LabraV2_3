/**
 * Tehtävä 1 – Person (luokat, kentät, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Lisää kentät: name (String) ja age (int) – pidä ne private.
 *  2. Toteuta konstruktorit: (name, age) ja (name) age=0.
 *  3. Toteuta `int birthday()` joka kasvattaa ikää ja palauttaa uuden iän.
 *  4. Ylikirjoita `toString()` ja `equals(Object)` (name + age).
 *
 * VINKIT:
 *  - Hyödynnä `java.util.Objects.equals(this.name, other.name)` equalsissa.
 *  - Käytä `@Override`-annotaatiota ylikirjoituksissa.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task01;

public class Person {
    // 1. Fields
    private String name;
    private Integer age;


    // 2. Constructors !! 2!! 
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    // Example
        // Person p1 = new Person("Pilar", 31);
        // Person p2 = new Person("Pilar"); // age = 0


    // 3. birthday() method: increases the person's age by 1 and returns the new age
    public int birthday() {
        this.age += 1;
        return this.age;
    }
    // Example
        // System.out.println(p1.birthday()); // prints 32
        // System.out.println(p2.birthday()); // prints 1

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    // equals(Ojbect o) checks wheter 2 'Person' objects are equal, based on their 'name' and 'age'
    @Override
    public boolean equals(Object o) { // We override the default 'equals()' method from 'Object'
    // 'this' refers to the current object, the one we are calling '.equals()' on
    // 'o' is the object we are comparint it to
    // 'this == o' -> Are these two references pointing to the exact same object? If yes, return true
        if (this == o) return true;
        // if 'o' is null, or not a 'Person' object, they can't be equal
        // getClass() ensures that you're comparing 2 objects of exactly the same class, not just any subclass
        if (o == null || getClass() != o.getClass()) return false;

        // Then we compare 'name' and 'age' using 'Objects.equals(...)', which is safer than using '==' or '.equals()'
        // 'Objects.equals(a, b)' returns true if both are equals, and handles null values
        Person other = (Person) o; // We cast 'o' to a 'Person' so you can access its fields
        return java.util.Objects.equals(this.name, other.name) && // Uses Objects.equals() to safely compare values
        java.util.Objects.equals(this.age, other.age);
        // Objects.equals() instead of this.name.equals(other.name), because:
            // if either name is null, it won't crash
            // if returns true if both are null, or if they're equal strings
    }
}

// Why Override?
// Override tells Java "I'm intentionally replacing a method from a superclass."
// toString() and equals(Object) are method that already exist in the base class Object
// So we are writing our own versions in 'Person', we are overriding those inherited methods.

