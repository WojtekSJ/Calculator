package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName(
            "When list is send , " +
                    "method will return list wihout odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {                                   // [7]
        //Given
        OddNumbersExterminator terminator = new OddNumbersExterminator();
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        //When
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> result = terminator.exterminate(lista);
        //Then
        //Assertions.assertEquals(expectedResult, result);
        Assertions.assertTrue(result.equals(expectedResult));
    }


    @DisplayName(
            "Test when list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {                                   // [7]
        //Given
        OddNumbersExterminator terminator = new OddNumbersExterminator();
        List<Integer> lista = new ArrayList<>(Arrays.asList());

        //When
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList());
        List<Integer> result = terminator.exterminate(lista);
        //Then
        Assertions.assertEquals(expectedResult, result);

    }

}
