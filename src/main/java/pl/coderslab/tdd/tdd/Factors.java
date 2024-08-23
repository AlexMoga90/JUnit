package pl.coderslab.tdd.tdd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factors {
    public static List<Integer> generatePrimeFactors(int n) {

        List<Integer> factors = new ArrayList<>();
        // Add the number of 2s that divide n to the list
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        // n must be odd at this point, so a skip of 2 is done (i.e., i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, add i to the list and divide
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        // This condition is to check if n is a prime number greater than 2
        if (n > 2) {
            factors.add(n);
        }
        return factors;

    }
}
