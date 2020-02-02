package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> continentCountries;

    public Continent(String continentName, Country... country) {

        this.continentName = continentName;
        continentCountries = new HashSet<Country>();

        for (Country country1 : country) {
            continentCountries.add(country1);
        }
    }

    public Set<Country> getContinentCountries() {
        return continentCountries;
    }
}
