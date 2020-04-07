package com.kodilla.good.patterns.flights;

import java.util.Set;

public class MainClass {
    public static void main(String[] args) {

        FlightsRepository flightsRepository = new PrivateFlightRepository();
            flightsRepository.getFlightSet().add(new PrivateFlight("KRAKOW", "WARSZAWA"));
            flightsRepository.getFlightSet().add(new PrivateFlight("WARSZAWA", "KRAKOW"));
            flightsRepository.getFlightSet().add(new PrivateFlight("WARSZAWA", "WROCLAW"));
            flightsRepository.getFlightSet().add(new PrivateFlight("WROCLAW", "WARSZAWA"));
            flightsRepository.getFlightSet().add(new PrivateFlight("SZCZECIN", "RZESZOW"));
            flightsRepository.getFlightSet().add(new PrivateFlight("RZESZOW", "SZCZECIN"));
            flightsRepository.getFlightSet().add(new PrivateFlight("GDANSK", "KRAKOW"));
            flightsRepository.getFlightSet().add(new PrivateFlight("KRAKOW", "GDANSK"));

        FlightFinder flightFinder = new PrivateFlightFinder(flightsRepository);
        Set departureCitySet = flightFinder.findFlightFrom("warszawa");
        flightFinder.findFlightTo("gdansk");
        flightFinder.findDirectFlight("krakow", "warszawa");
        flightFinder.findFlightFromTo(departureCitySet,"warszawa", "gdansk");


    }
}
