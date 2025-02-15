package com.hellborngoose.homework2.task4;

public class Auto extends Device{

    public Auto(String name, String description) {
        super(name, description);
        
    }
    @Override
    public void Sound() {
        System.out.println(name + " is honking.");
    }
    
}
