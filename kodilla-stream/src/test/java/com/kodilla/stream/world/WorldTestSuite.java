package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        BigDecimal number = new BigDecimal("99999999901234567890");
        Country Poland = new Country(new BigDecimal("10000001"), "Poland");
        Country Germany = new Country(new BigDecimal("10000002"), "Germany");
        Country England = new Country(new BigDecimal("10000003"), "England");
        Country Thailand = new Country(new BigDecimal("10000004"), "Thailand");
        Country India = new Country(new BigDecimal("10000005"), "India");
        Country China = new Country(new BigDecimal("10000006"), "China");
        Country Japan = new Country(new BigDecimal("10000007"), "Japan");
        Country USA = new Country(new BigDecimal("10000008"), "USA");
        Country Canada = new Country(new BigDecimal("10000009"), "Canada");



        Set<Country> EuropeCountries = new HashSet<>();
        Set<Country> AsiaCountries = new HashSet<>();
        Set<Country> AmericaCountries = new HashSet<>();

        EuropeCountries.add(Poland);
        EuropeCountries.add(Germany);
        EuropeCountries.add(England);

        AsiaCountries.add(Thailand);
        AsiaCountries.add(India);
        AsiaCountries.add(China);
        AsiaCountries.add(Japan);

        AmericaCountries.add(USA);
        AmericaCountries.add(Canada);

        Continent Europe = new Continent(EuropeCountries, "Europe");
        Continent Asia = new Continent(AsiaCountries, "Asia");
        Continent America = new Continent(AmericaCountries, "America");

        Set<Continent> EarthContinents = new HashSet<>();

        EarthContinents.add(Europe);
        EarthContinents.add(Asia);
        EarthContinents.add(America);

        World Earth = new World(EarthContinents, "Earth");
        //When

        BigDecimal totalPopulation = Earth.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPopulation = new BigDecimal("90000045");      // [4]
        assertEquals(expectedTotalPopulation, totalPopulation);                                  // [5]
    }
}
