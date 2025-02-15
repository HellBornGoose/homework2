package com.hellborngoose.homework2.task5;

public class Violin extends MisucalInstrument{
    public Violin(String name, String description) {
        super(name, description);
        
    }
    
    @Override
    public void Sound() {
        System.out.println("You hear a wonderfull sound of "+ name);
    }
    @Override
    public void History(){
        System.out.println("The violin originated in early 16th-century Italy, evolving from medieval bowed instruments like the rebec and vielle. Its design was perfected by renowned luthiers such as Andrea Amati, Antonio Stradivari, and Giuseppe Guarneri, making it a cornerstone of classical and modern music.");
    }
}
