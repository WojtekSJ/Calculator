package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    /*dodającą figurę do kolekcji,
usuwającą figurę z kolekcji,
pobierającą z kolekcji figurę z pozycji n listy,
zwracającą nazwy wszystkich figur w postaci jednego Stringa.*/

    @Nested
    @DisplayName("Tests for adding figure")
    class TestAdd {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(new Triangle(12, 3));

            //Then
            Assertions.assertEquals(1, collector.getShapeNumber());
            Assertions.assertEquals("Triangle", collector.getFigure(0).getShapeName());
        }
    }

    @Nested
    @DisplayName("Tests for removing figure")
    class TestRemove {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Triangle triangle1 = new Triangle(12,3);
            collector.addFigure(triangle1);
            //When

            boolean result = collector.remove(triangle1);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, collector.getShapeNumber());
        }

        @Test
        void testRemoveFigure2() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Triangle triangle1 = new Triangle(12,3);
            collector.addFigure(triangle1);
            collector.addFigure(triangle1);
            collector.addFigure(triangle1);
            collector.addFigure(triangle1);
            //When

            boolean result = collector.remove(triangle1);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(3, collector.getShapeNumber());
        }
    }

    @Nested
    @DisplayName("Tests for get figure on n position")
    class TestGet {
        @Test
        void testGet() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Triangle triangle1 = new Triangle(12,3);
            Square square1 = new Square(4);
            collector.addFigure(triangle1);
            collector.addFigure(square1);
            //When

            Shape result1 = collector.getFigure(0);
            Shape result2 = collector.getFigure(1);

            //Then
            Assertions.assertEquals(triangle1, result1);
            Assertions.assertEquals(square1, result2);
        }

        @Test
        void testGet1() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Triangle triangle1 = new Triangle(12,3);
            collector.addFigure(triangle1);

            //When

            Shape result = collector.getFigure(-1);

            //Then

            Assertions.assertNull(result);
        }

        @Test
        void testGet2() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Triangle triangle1 = new Triangle(12,3);
            collector.addFigure(triangle1);

            //When

            Shape result = collector.getFigure(2);

            //Then

            Assertions.assertNull(result);
        }
    }

    @Nested
    @DisplayName("Tests for show figure")
    class TestShowFigure {
        @Test
        void testShowFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Triangle triangle1 = new Triangle(12,3);
            Square square1 = new Square(4);
            collector.addFigure(triangle1);
            collector.addFigure(square1);
            //When

            String result = collector.showFigures();

            //Then
            Assertions.assertEquals("Triangle, Square", result);
        }
    }
}
