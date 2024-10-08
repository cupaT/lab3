package org.example;

import java.util.*;

public class PrimesGenerator implements Iterable<Integer> {
    private final List<Integer> primes;

    public PrimesGenerator(int n) {
        primes = generatePrimes(n);
    }

    private List<Integer> generatePrimes(int n) {
        List<Integer> primesList = new ArrayList<>();
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primesList.add(num);
                count++;
            }
            num++;
        }
        return primesList;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    public List<Integer> getPrimesReversed() {
        List<Integer> reversed = new ArrayList<>(primes);
        Collections.reverse(reversed);
        return reversed;
    }
}
