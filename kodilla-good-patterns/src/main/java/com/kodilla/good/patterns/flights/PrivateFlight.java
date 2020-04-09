package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class PrivateFlight implements Flight {
    private String departure;
    private String arrival;

    public PrivateFlight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public String getDeparture() {
        return this.departure;
    }

    @Override
    public String getArrival() {
        return this.arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrivateFlight that = (PrivateFlight) o;
        return Objects.equals(departure, that.departure) &&
                Objects.equals(arrival, that.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    @Override
    public String toString() {
        return "PrivateFlight from " + departure + " to " + arrival;
    }
}
