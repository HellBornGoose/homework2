package com.hellborngoose.homework2.task7;

public interface ISort {
    default void SortAsc(int[] numbers){
        java.util.Arrays.sort(numbers);
        
    };
    default void SortDesc(int[] numbers){
        java.util.Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    };
    
}
