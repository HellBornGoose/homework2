package com.hellborngoose.homework2.task4;

public class Steamboat extends Device{

    public Steamboat(String name, String description) {
        super(name, description);
        
    }
    @Override
    public void Sound() {
        System.out.println(name + " is blowing its horn.");
    }
    
}
