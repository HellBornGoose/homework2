package com.hellborngoose.homework2.task6;

public interface IMath {
    default int Max(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    };
    default int Min(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    };
    default float Avg(int[] numbers){
        int avg = 0;
        for(int i = 0; i < numbers.length; i++){
            avg+=numbers[i];
            
        }
        float result = avg/ numbers.length;
        return result;
    };
}
