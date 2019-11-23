package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private String ContinentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String continentName) {
        ContinentName = continentName;
    }

    public String getContinentName() {
        return ContinentName;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }

    public Set<Country> getCountry() {
        return countries;
    }
}