package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.*;

class WeatherForecastTestSuite {



    @BeforeEach
    public void beforeEveryTest() {

        System.out.println("Preparing to execute test");
    }

    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub(); // TODO produkty                   // [1]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAvarageStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub(); // TODO produkty                   // [1]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double result = weatherForecast.calculateAvarage();

        //Then
        Assertions.assertEquals(25.56, result);
    }

    @Test
    void testCalculateMedianStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub(); // TODO produkty                   // [1]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double result = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(25.5, result);
    }
}