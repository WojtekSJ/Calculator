package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        int routeFound = 0;
        Map<String, Boolean> searchFlight = new HashMap<>();
        searchFlight.put("Warszawa", true);
        searchFlight.put("Poznan", true);
        searchFlight.put("Wroclaw", true);
        searchFlight.put("Opole", true);
        searchFlight.put("Krakow", false);
        searchFlight.put("Katowice", true);
        searchFlight.put("Bydgoszcz", true);
        searchFlight.put("Lubin", false);

        /*for (Map.Entry<String, Boolean> entry : searchFlight.entrySet()) {
            if (flight.arrivalAirport.equals(entry.getKey()) && entry.getValue()) {
                routeFound++;
            }
        }*/
        if(searchFlight.containsKey(flight.getArrivalAirport()) && searchFlight.get(flight.getArrivalAirport())) {
            routeFound++;
        }


        if (routeFound > 0) {
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }
}


