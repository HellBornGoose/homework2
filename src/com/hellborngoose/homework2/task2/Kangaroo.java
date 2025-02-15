package com.hellborngoose.homework2.task2;

public class Kangaroo extends Animal{

    private Integer jumpHeight;
    public Kangaroo(String name, Integer speed, Integer strength, Integer jumpHeight) {
        super(name, speed, strength);
        this.jumpHeight = jumpHeight;
    }
    public void Jumping(){
        System.out.println("I`m jumping");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Jump height: " + jumpHeight);
    }
    
}
