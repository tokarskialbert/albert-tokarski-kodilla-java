package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class PrivateFlightRepository implements FlightsRepository {
    private List<Flight> privateFlightList = new ArrayList<>();

    @Override
    public List<Flight> getFlightList() {
        return this.privateFlightList;
    }
}
