package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class PrivateFlightFinder implements FlightFinder {
    @Override
    public void findFlightFrom(String cityName, FlightsRepository flightsRepository) {
        flightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getDeparture().toLowerCase().equals(cityName.toLowerCase()))
                .forEach(flight -> System.out.println("Matching flight: " + flight.toString()));
    }

    @Override
    public void findFlightTo(String cityName, FlightsRepository flightsRepository) {
        flightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getArrival().toLowerCase().equals(cityName.toLowerCase()))
                .forEach(flight -> System.out.println("Matching flight: " + flight.toString()));
    }

    @Override
    public boolean findDirectFlight(String departureCityName, String arrivalCityName, FlightsRepository flightsRepository) {
        List<Flight> directFlightList = flightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getDeparture().toLowerCase().equals(departureCityName.toLowerCase())
                        && flight.getArrival().toLowerCase().equals(arrivalCityName.toLowerCase()))
                .collect(Collectors.toList());

        if(directFlightList.size() > 0) {
            for (Flight flight : directFlightList) {
                System.out.println("Matching flight: " + flight.toString());
            }
            return true;
        } else {
            System.out.println("Sorry, no matching direct flight");
            return false;
        }
    }

    @Override
    public void findFlightFromTo(String departureCityName, String arrivalCityName, FlightsRepository flightsRepository) {
        if(!(findDirectFlight(departureCityName, arrivalCityName, flightsRepository))) {
            List<String> result = flightsRepository.getFlightSet().stream()
                    .filter(flight -> flight.getDeparture().toLowerCase().equals(departureCityName.toLowerCase()))
                    .map(a -> a.getArrival())
                    .collect(Collectors.toList());

            for(String inCity : result) {
                List<Flight> flightChangeList = flightsRepository.getFlightSet().stream()
                        .filter(flight -> flight.getDeparture().toLowerCase().equals(inCity.toLowerCase())
                            && flight.getArrival().toLowerCase().equals(arrivalCityName.toLowerCase()))
                        .collect(Collectors.toList());

                if(flightChangeList.size() > 0) {
                    System.out.println("Flight from: " + departureCityName.toUpperCase()
                            + ", change in: " + inCity.toUpperCase()
                            + ", arrival city: " + arrivalCityName.toUpperCase());
                }
            }
        }
    }
}
