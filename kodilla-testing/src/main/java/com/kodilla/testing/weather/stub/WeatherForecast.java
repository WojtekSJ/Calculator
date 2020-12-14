package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    public double sum = 0;
    public double counterRead = 0;
    public double avarage = 0;
    public double median = 0;
    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            sum = sum + temperature.getValue();
            counterRead++;

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]

        }
        return resultMap;
    }

    public double calculateAvarage() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            sum = sum + temperature.getValue();
            counterRead++;
        }

        if (counterRead == 0) {
            return 0;
        }
        else {

            return sum / counterRead;
        }
    }

    public double calculateMedian() {
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> medianList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            medianList.add(temperature.getValue());
            counterRead++;
        }

        //Arrays.sort(medianList);
        Collections.sort(medianList);
        if (counterRead == 0) {
            return 0;
        }
        else {
            int position = medianList.size()/2;
            int position2 = position - 1;

                return (medianList.get(position)+medianList.get(position2))/2;
        }
    }
}