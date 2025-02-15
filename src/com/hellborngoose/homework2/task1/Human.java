package com.hellborngoose.homework2.task1;

public class Human {
    private String name, gender;

    public Human(String name, String gender){
        this.name = name;
        this.gender = gender;
        
    }
    
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}
