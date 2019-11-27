package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final List<Country> countries;

    public Continent(final String continentName, List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public String getContinentName() {
        return continentName;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountry() {
        return countries;
    }
}