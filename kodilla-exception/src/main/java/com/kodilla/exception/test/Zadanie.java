package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Zadanie {
    public static void main(String[] args) {

        HashMap<String, Boolean> myMap = new HashMap<>();
        Lot lot1 = new Lot("wawa1","wawa2");
        Lot lot2 = new Lot("wawa3","wawa4");
        Lot lot3 = new Lot("wawa5","wawa6");
        Lot lot4 = new Lot("wawa7","wawa8");

        myMap.put(lot1.getArrivalCity(), true);
        myMap.put(lot2.getArrivalCity(), true);
        myMap.put(lot3.getArrivalCity(), false);
        myMap.put(lot4.getArrivalCity(), true);

        System.out.println();

        for(Map.Entry<String, Boolean> entry : myMap.entrySet()){
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }
    }
}


class Lot {
    String departurCity;
    String arrivalCity;

    public Lot(String departure, String arrival) {
        this.departurCity = arrival;
        this.arrivalCity = departure;
    }

    public String getDeparturCity() {
        return departurCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }
}