package com.hellborngoose.homework2.task5;

public class Cello extends MisucalInstrument{
    public Cello(String name, String description) {
        super(name, description);
        
    }

    @Override
    public void Sound() {
        System.out.println("You hear a amazing sound of "+ name);
    }
    @Override
    public void History(){
        System.out.println("Developed in the early 16th century in Italy, the cello evolved from earlier bowed instruments and became a vital part of orchestras and chamber music, with legendary makers like Stradivari refining its design.");
    }
}
