package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> continentCountries;

    public Continent(String continentName, Country... countries) {

        this.continentName = continentName;
        continentCountries = new HashSet<Country>();

        for (Country country : countries) {
            continentCountries.add(country);
        }
    }

    public Set<Country> getContinentCountries() {
        return continentCountries;
    }
}
