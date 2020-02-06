package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

   public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<String, Boolean>(); //zrobic tu gettera?
            flightMap.put("Krakow", true);
            flightMap.put("Wroclaw", true);
            flightMap.put("Poznan", true);

        try {

            if(!(flightMap.containsKey(flight.getArrivalAirport()))) {
                throw new RouteNotFoundException("text");
            }

        } catch (Exception ex) {
            throw new RouteNotFoundException("Something is wrong.");
        }
   }
}
