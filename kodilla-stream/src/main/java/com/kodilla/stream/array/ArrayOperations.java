package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        int lenght = numbers.length;
        int sumOfTable;
        int avarage = 4;
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        sumOfTable =0;

        avarage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .sum();
        if(numbers.length == 0){
            return 0;
        }
        return avarage/lenght;
    }
}
