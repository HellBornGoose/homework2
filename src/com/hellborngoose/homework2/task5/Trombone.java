package com.hellborngoose.homework2.task5;

public class Trombone extends MisucalInstrument{
    public Trombone(String name, String description) {
        super(name, description);
        
    }

    @Override
    public void Sound() {
        System.out.println("You hear a awesome sound of "+ name);
    }
    @Override
    public void History(){
        System.out.println("The trombone emerged in the 15th century from the sackbut, a Renaissance-era brass instrument, and became a key part of orchestras, jazz, and brass bands due to its unique slide mechanism.");
    }
}
