package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    Set<Country> listOfCountries = new HashSet<>();
    private String continentName;

    public Continent(Set<Country> listOfCountries, String continentName) {
        this.listOfCountries = listOfCountries;
        this.continentName = continentName;
    }

    public Set<Country> getListOfCountries() {
        return listOfCountries;
    }
}
