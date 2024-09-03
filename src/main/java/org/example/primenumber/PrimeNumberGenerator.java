package org.example.primenumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

    public List<Integer> generate(int max) {
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= max; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2, sqrt = (int) Math.sqrt(num); i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}