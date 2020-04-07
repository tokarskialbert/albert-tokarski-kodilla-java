package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrivateFlightFinder implements FlightFinder {

    FlightsRepository flightsRepository;

    public PrivateFlightFinder(FlightsRepository flightsRepository) {

        this.flightsRepository = flightsRepository;
    }

    @Override
    public Set findFlightTo(String cityName) {

        return this.flightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getArrival().toLowerCase().equals(cityName.toLowerCase()))
                .collect(Collectors.toSet());
    }

    @Override
    public boolean findDirectFlight(String departureCityName, String arrivalCityName) {

        return this.flightsRepository.getFlightSet().stream()
                .anyMatch(flight -> flight.getDeparture().toLowerCase().equals(departureCityName.toLowerCase())
                        && flight.getArrival().toLowerCase().equals(arrivalCityName.toLowerCase()));
    }

    @Override
    public Set findFlightFrom(String cityName) {

        return this.flightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getDeparture().toLowerCase().equals(cityName.toLowerCase()))
                .collect(Collectors.toSet());
    }

    @Override
    public void findFlightFromTo(Set<Flight> departureCitySet, String departureCityName, String arrivalCityName) {

        if(!(findDirectFlight(departureCityName, arrivalCityName))) {

            List<String> result = departureCitySet.stream()
                    .map(a -> a.getArrival())
                    .collect(Collectors.toList());

            for(String inCity : result) {
                Set<Flight> flightChangeSet = flightsRepository.getFlightSet().stream()
                        .filter(flight -> flight.getDeparture().toLowerCase().equals(inCity.toLowerCase()))
                        .filter(flight -> flight.getArrival().toLowerCase().equals(arrivalCityName.toLowerCase()))
                        .collect(Collectors.toSet());

                if(flightChangeSet.size() > 0) {
                    System.out.println("Flight from: " + departureCityName.toUpperCase()
                            + ", change in: " + inCity.toUpperCase()
                            + ", arrival city: " + arrivalCityName.toUpperCase());
                }
            }
        }
    }
}
