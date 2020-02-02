package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal population;

    public Country(String countryName, BigDecimal population) {
        this.countryName = countryName;
        this.population = population;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return countryName;
    }
}
