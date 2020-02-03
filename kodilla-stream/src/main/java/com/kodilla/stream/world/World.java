package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
    private final Set<Continent> continentsSet;

    public World(Continent... continents) {
        this.continentsSet = new HashSet<>();

        for (Continent continent : continents) {
            this.continentsSet.add(continent);
        }
    }

    public BigDecimal getWorldPopulation() {

        BigDecimal result = continentsSet.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(country -> country.getPopulation())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return result;
    }
}
