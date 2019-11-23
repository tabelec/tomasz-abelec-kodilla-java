package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private String CountryName;
    private BigDecimal peopleQuantity ;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        CountryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return CountryName;
    }
}