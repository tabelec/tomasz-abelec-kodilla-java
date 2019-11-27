package com.kodilla.exception.test;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flight{");
        sb.append("departureAirport='").append(departureAirport).append('\'');
        sb.append(", arrivalAirport='").append(arrivalAirport).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
