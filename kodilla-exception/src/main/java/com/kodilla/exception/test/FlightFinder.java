package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

   public boolean findArrivalAirport(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<String, Boolean>();
            flightMap.put("Krakow", true);
            flightMap.put("Wroclaw", false);
            flightMap.put("Poznan", true);

            if(!(flightMap.containsKey(flight.getArrivalAirport()))) {
                throw new RouteNotFoundException("text");
        }
            List<String> foundedFlights = new ArrayList<>();

                    flightMap.entrySet().stream()
                    .filter(t -> t.getKey().toLowerCase().equals(flight.getArrivalAirport().toLowerCase()))
                    .filter(t -> t.getValue().booleanValue() == true)
                    .forEach(t -> foundedFlights.add(t.getKey()));

                    if(foundedFlights.isEmpty()) {
                        return false;
                    } else
                    {
                        return true;
                    }
   }

    public boolean findDepartureAirport(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<String, Boolean>();
        flightMap.put("Katowice", true);
        flightMap.put("Paryz", false);
        flightMap.put("Warszawa", true);

        if(!(flightMap.containsKey(flight.getDepartureAirport()))) {
            throw new RouteNotFoundException("There is no airport like this");
        }
        List<String> foundedFlights = new ArrayList<>();

        flightMap.entrySet().stream()
                .filter(t -> t.getKey().toLowerCase().equals(flight.getDepartureAirport().toLowerCase()))
                .filter(t -> t.getValue().booleanValue() == true)
                .forEach(t -> foundedFlights.add(t.getKey()));

        if(foundedFlights.isEmpty()) {
            return false;
        } else
        {
            return true;
        }
    }


}
