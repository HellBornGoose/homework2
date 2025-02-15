package com.hellborngoose.homework2.task4;

public class Teapot extends Device{

    public Teapot(String name, String description) {
        super(name, description);
        
    }
    @Override
    public void Sound() {
        System.out.println(name + " is whistling.");
    }
    
}
