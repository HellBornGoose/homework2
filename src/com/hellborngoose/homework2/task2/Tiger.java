package com.hellborngoose.homework2.task2;

public class Tiger extends Animal{

    private Integer weight;
    public Tiger(String name, Integer speed, Integer strength, Integer weight) {
        super(name, speed, strength);
        this.weight = weight;
    }
    public void Roaring(){
        System.out.println("ROAAAAAAAAAAR");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }
    
}
