/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

 // Overload methods (same name, different parameters)
 // Loop through arrays to calculate values
 // Defend agaisnt null or empty arrays
 // Max and min values in an array

package fi.viikko2.task02;

public class MathUtil {
    // sum methods
        // sum(int[]) and sum(double[]) loop through arrays and add up the values
            // Defensive check if array is null or empty, then return 0 or 0.0
    public static int sum(int a, int b) { return a + b; } // simple addition of two integers
    public static int sum(int a, int b, int c) { return a + b + c; } // simple addition of three integers
    
    public static int sum(int[] arr) { // Loops through an array of integers and adds them up 
        if (arr == null || arr.length == 0) return 0;
        int total = 0;
        for (int num: arr) {
            total += num;
        }
        return total;
    }
    public static double sum(double[] arr) { // Same as the previous method, but array of doubles
        if (arr == null || arr.length == 0) return 0.0;
        double total = 0.0;
        for (double num : arr) {
            total += num;
        }
        return total;
    }

    // Overload: we use the same method name ('sum') but different parameter types or counts. 
    // Java know which one to call based on the input

    // max and min methods
    public static int max(int[] arr) { // we take a int array as input, from which we will get the largest number
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        // 'arr == null' checks if the array reference is null
        // 'arr.length == 0' checks if its empty
        // 'Integer.MIN_VALUE': The smallest possible 'int' value in Java (-2^31). Used as a fallback
        // In programming a fallback is a default value or behaviour used when something goes wrong or is missing
        
        int max = arr[0]; // initialize max, assume the first element is the maximum for now
        
        // enhanced for loop, "for each" loop
            // arr: array we are looping through
            // num: temporary variable that gets assigned each element of the array, one at a time
        for (int num : arr) { // 'for(int num : arr)': Iterates over each element in the array
            if (num > max) { // 'if(num > max)': If the current number is greater than the current 'max', update 'max'
                max = num;
            }
        }
        return max;
    }


    public static int min(int[] arr) { // returns the smallest number in the array
        if (arr == null || arr.length == 0) return Integer.MAX_VALUE; // if the array is null or empty, return the largest possible int in Java ( 2^31 -1)
        int min = arr[0]; //initialize min
        for (int num : arr) { // loop through the array and update min if there is a smaller number
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int placeholderInt(){ return 0; }
    public static double placeholderDouble(){ return 0.0; }
}