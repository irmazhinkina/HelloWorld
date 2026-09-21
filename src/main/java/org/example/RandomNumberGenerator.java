package org.example;

import java.util.concurrent.ThreadLocalRandom;

/** Generates random integers within an inclusive range. */
public class RandomNumberGenerator {

    /**
     * Returns a random integer between {@code min} and {@code max}, inclusive.
     */
    public static int generate(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must not be greater than max");
        }

        if (min == max) {
            return min;
        }

        return max == Integer.MAX_VALUE
                ? ThreadLocalRandom.current().nextInt(min, max) + (ThreadLocalRandom.current().nextBoolean() ? 1 : 0)
                : ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static void main(String[] args) {
        System.out.println(generate(1, 100));
    }
}
