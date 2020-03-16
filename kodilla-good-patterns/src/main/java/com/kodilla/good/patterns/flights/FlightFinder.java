package com.kodilla.good.patterns.flights;

public interface FlightFinder {
    void findFlightFrom(String cityName, FlightsRepository flightsRepository);
    void findFlightTo(String cityName, FlightsRepository flightsRepository);
    boolean findDirectFlight(String departureCityName, String arrivalCityName, FlightsRepository flightsRepository);
    void findFlightFromTo(String departureCityName, String arrivalCityName, FlightsRepository flightsRepository);
}
