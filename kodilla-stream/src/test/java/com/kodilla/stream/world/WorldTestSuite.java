package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> europeCountries = new ArrayList<>();

        Country polska = new Country("Polska",new BigDecimal("100"));
        Country holandia = new Country("Holandia",new BigDecimal("100"));
        Country niemcy = new Country("Niemcy",new BigDecimal("100"));
        Country rosja = new Country("Rosja",new BigDecimal("100"));
        europeCountries.add(polska);
        europeCountries.add(holandia);
        europeCountries.add(niemcy);
        europeCountries.add(rosja);

        List<Country> asiaCountries = new ArrayList<>();
        Country chiny = new Country("Chiny",new BigDecimal("100"));
        Country japonia = new Country("Japonia",new BigDecimal("100"));
        Country korea = new Country("Korea",new BigDecimal("100"));
        Country indie = new Country("Indie",new BigDecimal("100"));
        asiaCountries.add(chiny);
        asiaCountries.add(japonia);
        asiaCountries.add(korea);
        asiaCountries.add(indie);

        List<Country> someCountries = new ArrayList<>();
        Country kraj1 = new Country("Kraj1",new BigDecimal("100"));
        Country kraj2 = new Country("Kraj2",new BigDecimal("100"));
        Country kraj3 = new Country("Kraj3",new BigDecimal("100"));
        Country kraj4 = new Country("Kraj4",new BigDecimal("100"));
        someCountries.add(kraj1);
        someCountries.add(kraj2);
        someCountries.add(kraj3);
        someCountries.add(kraj4);

        List<Continent> continents = new ArrayList<>();
        Continent asia = new Continent("Azja", asiaCountries);
        Continent europe = new Continent("Europa", europeCountries);
        Continent australia = new Continent("Australia", someCountries);

        continents.add(asia);
        continents.add(europe);
        continents.add(australia);

        //When
        //BigDecimal totalSand = continents.stream()
              //  .map(SandStorage::getSandBeansQuantity)
          //      .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeople = new BigDecimal("211111110903703703670");
        //Assert.assertEquals(expectedSand, totalSand);
    }
}