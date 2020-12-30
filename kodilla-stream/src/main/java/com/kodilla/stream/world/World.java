package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    public Set<Continent> listOfContinents = new HashSet<>();
    private String worldName;
    BigDecimal totalPopulation = new BigDecimal("0");

    public World(Set<Continent> listOfContinents, String worldName) {
        this.listOfContinents = listOfContinents;
        this.worldName = worldName;
    }

    public Set<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()                               // [1]
                .flatMap(user -> user.getListOfCountries().stream())       // [2]
                .map(Country::getPeopleQuantity)                       // [4]
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //return totalPopulation;

    }
}
