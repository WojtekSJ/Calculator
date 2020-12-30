package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal population;
    private final String countryName;

    public Country(BigDecimal population, String countryName) {
        this.population = population;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Country that = (Country) obj;
        return countryName.equals(that.countryName);
    }
}
