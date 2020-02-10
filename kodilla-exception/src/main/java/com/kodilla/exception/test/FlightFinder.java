package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> flightMap;
    private boolean departureAirportStatus = false;
    private boolean arrivalAirportStatus = false;

    public FlightFinder() {

        flightMap = new HashMap<String, Boolean>();
        flightMap.put("Katowice", true);
        flightMap.put("Paryz", false);
        flightMap.put("Warszawa", true);
        flightMap.put("Krakow", true);
        flightMap.put("Moskwa", false);
        flightMap.put("Olsztyn", false);

    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if(!(flightMap.containsKey(flight.getDepartureAirport())) || !(flightMap.containsKey(flight.getArrivalAirport()))) {
            throw new RouteNotFoundException("There is no airport like this");
        }

        flightMap.entrySet().stream()
                .filter(t -> t.getKey().toLowerCase().equals(flight.getDepartureAirport().toLowerCase()))
                .filter(t -> t.getValue().booleanValue() == true)
                .findAny().ifPresent(t -> departureAirportStatus = true);

        flightMap.entrySet().stream()
                .filter(t -> t.getKey().toLowerCase().equals(flight.getArrivalAirport().toLowerCase()))
                .filter(t -> t.getValue().booleanValue() == true)
                .findAny().ifPresent(t -> arrivalAirportStatus = true);

        if(departureAirportStatus && arrivalAirportStatus) {
            System.out.println("I find flight");
            return true;

        } else {
            System.out.println("I find nothing");
            return false;
        }
    }
}
