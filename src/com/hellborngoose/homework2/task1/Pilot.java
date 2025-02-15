package com.hellborngoose.homework2.task1;

public class Pilot extends Human{
    private Integer flights;

    public Pilot(String name, String gender, Integer flights) {
        super(name, gender);
        this.flights = flights;
        
    }

    public Integer getFlights() {
        return flights;
    }

    public void setFlights(Integer flights) {
        this.flights = flights;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Flights: " + flights);
    }
}
