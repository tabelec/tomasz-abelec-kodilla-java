package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAvarage(int[] numbers) {
        int size = numbers.length;
        if (size > 0) {
            return IntStream.range(0, size)
                    .map(n -> numbers[n])
                    .average().getAsDouble();
        } else return 0;

    }


}
