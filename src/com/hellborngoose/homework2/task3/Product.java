package com.hellborngoose.homework2.task3;

public class Product extends Money{

    private String name;
    private Money price;
    public Product(String name, Money price) {
        this.price = price;
        this.name = name;
    }
    public void display() {
        System.out.print("Product: " + name + ", Price: ");
        price.display();
    }

    public void reducePrice(Integer amountWhole, Integer amountCents) {
        Integer totalCents = price.getWholePart() * 100 + price.getCents();
        Integer reduction = amountWhole * 100 + amountCents;
        
        if (reduction > totalCents) {
            System.out.println("Error: Price cannot be negative.");
        } else {
            totalCents -= reduction;
            price.setWholePart(totalCents / 100);
            price.setCents(totalCents % 100);
        }
    }
    
}
