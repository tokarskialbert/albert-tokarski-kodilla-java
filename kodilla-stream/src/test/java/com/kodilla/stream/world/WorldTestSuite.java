package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class WorldTestSuite {

    @Test
    public void testCreateContinent() {

        //given
        Country poland = new Country("Poland", new BigDecimal(38_100_123));
        Country germany = new Country("Germany", new BigDecimal(82_200_023));
        Continent europe = new Continent("Europe",poland, germany);

        //when
        int result = europe.getContinentCountries().size();

        //then
        Assert.assertTrue(result == 2);
    }

    @Test
    public void testGetCountryPopulation() {

        //given
        Country poland = new Country("Poland", new BigDecimal(38_100_123));
        Country germany = new Country("Germany", new BigDecimal(82_200_023));
        Continent europe = new Continent("Europe", poland, germany);

        //when
        BigDecimal bigDecimal = new BigDecimal(38100123);
        String polandPopulation = bigDecimal.toString();
        String result = europe.getContinentCountries().stream()
                .filter(country -> country.toString().equals("Poland"))
                .map(country -> country.getPopulation().toString())
                .collect(Collectors.joining());

        //then
        Assert.assertTrue(result.equals(polandPopulation));
    }

    @Test
    public void testGetWorldPopulation() {

        //given
        Country poland = new Country("Poland", new BigDecimal(38_100_123));
        Country germany = new Country("Germany", new BigDecimal(82_200_023));
        Continent europe = new Continent("Europe", poland, germany);

        Country japan = new Country("Japan", new BigDecimal(68_100_123));
        Country china = new Country("China", new BigDecimal(1_300_200_023));
        Continent asia = new Continent("Asia", japan, china);

        //when
        World world = new World(europe, asia);
        BigDecimal population = new BigDecimal(1488600292);
        BigDecimal result = world.getWorldPopulation();

        //then
        Assert.assertTrue(result.compareTo(population) == 0);
    }
}
