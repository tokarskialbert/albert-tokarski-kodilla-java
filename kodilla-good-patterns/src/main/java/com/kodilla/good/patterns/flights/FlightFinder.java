package com.kodilla.good.patterns.flights;

import java.util.Set;

public interface FlightFinder {
    Set findFlightFrom(String cityName);
    Set findFlightTo(String cityName);
    boolean findDirectFlight(String departureCityName, String arrivalCityName);
    void findFlightFromTo(Set<Flight> departureCitySet, String departureCityName, String arrivalCityName);
}
