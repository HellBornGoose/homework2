package com.hellborngoose.homework2.task6;

public class Array implements IMath{
    private int[] numbers;
    public Array(int[] numbers) {
        this.numbers = numbers; 
    }
    public int getMax() {
        return Max(numbers);
    }

    public int getMin() {
        return Min(numbers);
    }

    public float getAvg() {
        return Avg(numbers);
    }
}
