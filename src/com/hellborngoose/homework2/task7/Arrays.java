package com.hellborngoose.homework2.task7;

public class Arrays implements ISort{
    private int[] numbers;
    public Arrays(int[] numbers) {
        this.numbers = numbers; 
    }
    public void getSort() {
        SortAsc(numbers);
    }

    public void getRevSort() {
        SortDesc(numbers);
    }
    public void printArray() {
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
