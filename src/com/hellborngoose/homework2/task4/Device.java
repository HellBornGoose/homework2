package com.hellborngoose.homework2.task4;

public class Device {
    protected String name;
    protected String description;
    public Device(String name, String description){
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
}
