package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class PrivateFlightRepository implements FlightsRepository {
    private Set<Flight> privateFlightSet = new HashSet<>();

    @Override
    public Set<Flight> getFlightSet() {
        return this.privateFlightSet;
    }
}
