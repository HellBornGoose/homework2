package com.hellborngoose.homework2.task2;

public class Crocodile extends Animal{

    private Integer length;
    public Crocodile(String name, Integer speed, Integer strength, Integer length) {
        super(name, speed, strength);
        this.length = length;
    }
    
    public void Swimming(){
        System.out.println("I`m swimming");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Length: " + length);
    }
    
}
