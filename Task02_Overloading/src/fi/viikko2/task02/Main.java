/**
 * Tehtävä 2 – Main (testaa MathUtil)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo int[] ja double[] ja testaa sum/min/max.
 *  2. Tulosta tulokset.
 *
 * VINKIT:
 *  - Korvaa placeholderit oikeilla metodeilla kun olet valmis.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] a = {1,2,3};
        double[] b = {1.5,2.5,3.0};

        // Call MathUtil methods and print results
        System.out.println("Sum of int[]: " + MathUtil.sum(a));
        System.out.println("Sum of double[]: " + MathUtil.sum(b));
        System.out.println("Min of int[]: " + MathUtil.min(a));
        System.out.println("Min of int[]: " + MathUtil.max(a));

        // Test simple sum methods - sum(int, int) and sum(int, int, int)
        System.out.println("Sum of 2 ints: " + MathUtil.sum(5,3));
        System.out.println("Sum of 3 ints: " + MathUtil.sum(5,3,2));
    }
}