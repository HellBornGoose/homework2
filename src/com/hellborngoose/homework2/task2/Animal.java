package com.hellborngoose.homework2.task2;

public class Animal {
    private String name;
    private Integer speed, strength;

    public Animal(String name, Integer speed, Integer strength){
        this.name = name;
        this.speed = speed;
        this.strength = strength;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Strength: " + strength);
    }
}
