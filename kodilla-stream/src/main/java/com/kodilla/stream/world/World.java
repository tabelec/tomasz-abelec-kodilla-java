package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal calculatePopulation() {
        return continents.stream()
                .flatMap(continent -> continent.getCountry().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}