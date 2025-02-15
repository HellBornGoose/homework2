package com.hellborngoose.homework2;
import java.util.Scanner;
import com.hellborngoose.homework2.task1.*;
import com.hellborngoose.homework2.task2.*;
import com.hellborngoose.homework2.task3.*;
import com.hellborngoose.homework2.task4.*;
import com.hellborngoose.homework2.task5.*;
import com.hellborngoose.homework2.task6.*;
import com.hellborngoose.homework2.task7.*;


public class Homework2 {
    public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) throws Exception {
            try{
                task7();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                scanner.close();
            }
        }
    public static void task1(){
        Human firstHuman = new Human("Adam", "male");
        Builder firstBuilder = new Builder("Jorik", "male", "wood");
        Sailor firstSailor = new Sailor("Moryak", "male", 7);
        Pilot firstPilot = new Pilot("Pilot", "male", 213);
        System.out.println("Human:");
        firstHuman.showInfo();
        System.out.println("Builder:");
        firstBuilder.showInfo();
        System.out.println("Sailor:");
        firstSailor.showInfo();
        System.out.println("Pilot:");
        firstPilot.showInfo();
    }
    public static void task2(){
        Animal firstAnimal = new Animal("cat", 12, 6);
        Tiger firstTiger = new Tiger("Tiger", 12, 6, 435);
        Crocodile firstCrocodile = new Crocodile("Crocodile", 12, 6, 20);
        Kangaroo firstKangaroo = new Kangaroo("Kangaroo", 12, 6, 35);
        System.out.println("Animal:");
        firstAnimal.showInfo();
        System.out.println("Tiger:");
        firstTiger.showInfo();
        firstTiger.Roaring();
        System.out.println("Crocodile:");
        firstCrocodile.showInfo();
        firstCrocodile.Swimming();
        System.out.println("Kangaroo:");
        firstKangaroo.showInfo();
        firstKangaroo.Jumping();
    }
    public static void task3(){
        Money money = new Money(10, 50);
        Product product = new Product("Laptop", money);

        product.display();
        product.reducePrice(2, 75);
        product.display();
    }
    public static void task4(){
        Device firstDevice = new Device("Test device", "For testing");
        Microwave firstMicrowave = new Microwave("Microwave", "The best microwave!!!");
        Auto firstAuto = new Auto("Auto", "The fastest auto in the world!!!");
        Steamboat firstSteamboat = new Steamboat("Steamboat", "The largest steamboat!!!");
        Teapot firstTeapot = new Teapot("Teapot", "The most comfortable teapot!!!");
        firstDevice.Desc();
        firstMicrowave.Desc();
        firstAuto.Desc();
        firstSteamboat.Desc();
        firstTeapot.Desc();
        firstDevice.Sound();
        firstMicrowave.Sound();
        firstAuto.Sound();
        firstSteamboat.Sound();
        firstTeapot.Sound();
    }
    public static void task5(){
        Violin myViolin = new Violin("Violin", "Unbelivable quality!");
        myViolin.Show();
        myViolin.Desc();
        myViolin.Sound();
        myViolin.History();
        Trombone myTrombone = new Trombone("Trombon", "The cleanest sound!");
        myTrombone.Show();
        myTrombone.Desc();
        myTrombone.Sound();
        myTrombone.History();
        Ukulele myUkulele = new Ukulele("Ukulele", "The most expensive ukulele!");
        myUkulele.Show();
        myUkulele.Desc();
        myUkulele.Sound();
        myUkulele.History();
        Cello myCello= new Cello("Cello", "I can't think rn!");
        myCello.Show();
        myCello.Desc();
        myCello.Sound();
        myCello.History();
    }
    public static void task6(){
        int[] data = {5, 8, 2, 10, 3};
        Array array = new Array(data);
        
        System.out.println("Max: " + array.getMax());
        System.out.println("Min: " + array.getMin());
        System.out.println("Avg: " + array.getAvg());
    }
    public static void task7(){
        int[] data = {5, 8, 2, 10, 3};
        Arrays array = new Arrays(data);

        System.out.println("Original array: ");
        array.printArray();
        
        array.getSort();
        System.out.println("Sorted Ascending: ");
        array.printArray();
        
        array.getRevSort();
        System.out.println("Sorted Descending: ");
        array.printArray();
    }
}

