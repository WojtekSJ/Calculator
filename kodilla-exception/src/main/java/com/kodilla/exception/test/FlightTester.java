package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightTester {
    public boolean runSearch(Flight trasa, FlightFinder examinator){
        try {
            System.out.println("Trasa docelowa: " + trasa.arrivalAirport + " jest na liscie: " + examinator.findFlight(trasa));
            return true;
        } catch (RouteNotFoundException e) {
            System.out.println("Miasto docelowe: " + trasa.arrivalAirport + " nie znalezione w ofercie");
            return false;
        } finally{
            System.out.println("Dziekujemy za skorzystanie z oferty");
        }



    }


    public static void main(String[] args) {
    Flight trasa1 = new Flight("Poznan", "Warszawa");
    Flight trasa2 = new Flight("Poznan", "Dublin");
    Flight trasa3 = new Flight("Poznan", "Krakow");
    Flight trasa4 = new Flight("Oslo", "Londyn");

    List<Flight> searchList = new ArrayList<>();
    searchList.add(trasa1);
    searchList.add(trasa2);
    searchList.add(trasa3);
    searchList.add(trasa4);

    FlightFinder examinator = new FlightFinder();
    FlightTester tryMe = new FlightTester();



    List<Flight> result = searchList.stream()
            .filter(n -> tryMe.runSearch(n, examinator))
             .collect(Collectors.toList());

    System.out.print(result.size());
        System.out.print(result);
}
}
