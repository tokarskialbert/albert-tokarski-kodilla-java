package com.kodilla.good.patterns.flights;

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

        FlightFinder flightFinder = new PrivateFlightFinder();
        flightFinder.findFlightFrom("krakow", flightsRepository);
        System.out.println("***");
        flightFinder.findFlightTo("wroclaw", flightsRepository);
        System.out.println("***");
        flightFinder.findDirectFlight("krakow", "warszawa", flightsRepository);
       // flightFinder.findFlightFromTo("krakow", "gdansk", flightsRepository);
      //  System.out.println("***");
       // flightFinder.findFlightFromTo("warszawa", "gdansk", flightsRepository);


    }
}
