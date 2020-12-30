package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] table = new int[6];
        table[0] = 4;
        table[1] = 8;
        table[2] = 4;
        table[3] = 8;
        table[4] = 4;
        table[5] = 8;
        //When
        double testAvarage = ArrayOperations.getAverage(table);


        //Then
        assertEquals(6, testAvarage);                                  // [5]
    }
}
