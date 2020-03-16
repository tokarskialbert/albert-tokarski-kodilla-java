package com.kodilla.good.patterns.flights;

public class MainClass {
    public static void main(String[] args) {

        FlightsRepository flightsRepository = new PrivateFlightRepository();
        flightsRepository.getFlightList().add(new PrivateFlight("KRAKOW", "WARSZAWA"));
        flightsRepository.getFlightList().add(new PrivateFlight("WARSZAWA", "KRAKOW"));
        flightsRepository.getFlightList().add(new PrivateFlight("WARSZAWA", "WROCLAW"));
        flightsRepository.getFlightList().add(new PrivateFlight("WROCLAW", "WARSZAWA"));
        flightsRepository.getFlightList().add(new PrivateFlight("SZCZECIN", "RZESZOW"));
        flightsRepository.getFlightList().add(new PrivateFlight("RZESZOW", "SZCZECIN"));
        flightsRepository.getFlightList().add(new PrivateFlight("GDANSK", "KRAKOW"));
        flightsRepository.getFlightList().add(new PrivateFlight("KRAKOW", "GDANSK"));

        FlightFinder flightFinder = new PrivateFlightFinder();
        flightFinder.findFlightFrom("krakow", flightsRepository);
        System.out.println("***");
        flightFinder.findFlightTo("wroclaw", flightsRepository);
        System.out.println("***");
        flightFinder.findFlightFromTo("krakow", "gdansk", flightsRepository);
        System.out.println("***");
        flightFinder.findFlightFromTo("warszawa", "gdansk", flightsRepository);


    }
}
