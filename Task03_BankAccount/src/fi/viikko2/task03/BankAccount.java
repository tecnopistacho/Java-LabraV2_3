/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
    // Fields - Encapsulation ensures that these fields can only be accessed or modified through methods
    private String accountNumber;
    private Double balance;

    // Constructor, called when creating a new object
    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber; // Assigns the parameter to the field
        if (balance == null || balance < 0){
            this.balance = 0.0;
        }
        else {
            this.balance = balance;
        }
    }

    // Methods: deposit(amound) and withdraw(amount)
    public void deposit(Double amount) { // Adds money if the amount is positive
        if(amount != null && amount > 0) { // Check that amount is not null and it is positive
            this.balance += amount; // Adds the amount to the current balance
        }
    }
    public void withdraw(Double amount) { // Substracts money only if the amount is valid and does not exceed the balance
        if(amount != null && amount > 0 && amount <= this.balance) { // amount is not null, it is positive, it does not exceed the current balance
            this.balance -= amount; // Substracts the amount
        }
    }

    public Double getBalance() { // getter method, returns the balance
        return this.balance;
    }
    
    @Override
    public String toString(){
        return "Account number: " + accountNumber + ", balance: " + balance +".";
    }

    @Override // Compares two BankAccount objects based only on accountNumber, avoids comparing balance to prevent floating-point issues
    public boolean equals(Object o){
        if (this == o) return true; // checks if both references point to the same object
        if (o == null || getClass() != o.getClass()) return false;
        // 'getClass() != o.getClass()' Ensures the object is a BankAccount

        BankAccount other = (BankAccount) o; // casts 'o' to 'BankAccount' and compares 'accountNumber'
        return java.util.Objects.equals(this.accountNumber, other.accountNumber);
    }
}

/* BankAccount Class
 *  acc number (String)
 *  balance (Double)
 *  methods: deposit, withdraw, and compare accounts
 *  custom toString() and equals() methods
 */