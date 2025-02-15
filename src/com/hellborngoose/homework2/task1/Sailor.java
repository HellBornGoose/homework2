package com.hellborngoose.homework2.task1;

public class Sailor extends Human{
    private Integer expirience;

    public Sailor(String name, String gender, Integer expirience) {
        super(name, gender);
        this.expirience = expirience;
        
    }

    public Integer getExpirience() {
        return expirience;
    }

    public void setExpirience(Integer expirience) {
        this.expirience = expirience;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Expirience: " + expirience);
    }
}
