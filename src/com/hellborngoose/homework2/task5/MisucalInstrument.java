package com.hellborngoose.homework2.task5;

public class MisucalInstrument {
    protected String name;
    protected String description;
    public MisucalInstrument(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void Show(){
        System.out.println(name);
    }
    public void Desc(){
        System.out.println(description);
    }
    public void Sound(){
        System.out.println("No sound registered");
    }
    public void History(){
        System.out.println("No history for that");
    }
}
