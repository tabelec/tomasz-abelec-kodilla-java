package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        ArrayList<Country> europeCountries = new ArrayList<>();

        Country polska = new Country("Polska",new BigDecimal("11111111111111111111111121"));
        Country holandia = new Country("Holandia",new BigDecimal("1112998889888879879781"));
        Country niemcy = new Country("Niemcy",new BigDecimal("1115645411158414584121"));
        Country rosja = new Country("Rosja",new BigDecimal("1144841132125470121"));
        europeCountries.add(polska);
        europeCountries.add(holandia);
        europeCountries.add(niemcy);
        europeCountries.add(rosja);

        ArrayList<Country> asiaCountries = new ArrayList<>();
        Country chiny = new Country("Chiny",new BigDecimal("11111111111111111111121"));
        Country japonia = new Country("Japonia",new BigDecimal("1112998889879879781"));
        Country korea = new Country("Korea",new BigDecimal("15645411158414584121"));
        Country indie = new Country("Indie",new BigDecimal("1841132125470121"));
        asiaCountries.add(chiny);
        asiaCountries.add(japonia);
        asiaCountries.add(korea);
        asiaCountries.add(indie);

        ArrayList<Country> someCountries = new ArrayList<>();
        Country kraj1 = new Country("Kraj1",new BigDecimal("11111111111111111111121"));
        Country kraj2 = new Country("Kraj2",new BigDecimal("111299879879781"));
        Country kraj3 = new Country("Kraj3",new BigDecimal("111564511158414584121"));
        Country kraj4 = new Country("Kraj4",new BigDecimal("1144132125470121"));
        someCountries.add(kraj1);
        someCountries.add(kraj2);
        someCountries.add(kraj3);
        someCountries.add(kraj4);

        ArrayList<Continent> continents = new ArrayList<>();
        Continent asia = new Continent("Azja");
        Continent europe = new Continent("Europa");
        Continent australia = new Continent("Australia");

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