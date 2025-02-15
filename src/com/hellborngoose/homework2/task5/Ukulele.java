package com.hellborngoose.homework2.task5;

public class Ukulele extends MisucalInstrument{
    public Ukulele(String name, String description) {
        super(name, description);
        
    }

    @Override
    public void Sound() {
        System.out.println("You hear a excelent sound of "+ name);
    }
    @Override
    public void History(){
        System.out.println("Originating in the late 19th century in Hawaii, the ukulele was inspired by Portuguese stringed instruments like the machete, quickly becoming a symbol of Hawaiian music and later gaining global popularity.");
    }
}
