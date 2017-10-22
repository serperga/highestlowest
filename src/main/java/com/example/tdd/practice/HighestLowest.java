package com.example.tdd.practice;

import java.util.*;

public class HighestLowest {
    public String minAndMaxOfArray(String s) {
        String result="";

        int[] integerArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        if (integerArray.length == 1){
            result = integerArray[0] + " " + integerArray[0];
        }

        if (integerArray.length == 2){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < integerArray.length;i++){
                int valueFromArray = integerArray[i];
                if ( valueFromArray < min){
                    min = valueFromArray;
                }
                if ( valueFromArray > max){
                    max = valueFromArray;
                }
            }
            result = max + " " + min;
        }
        return result;
    }
}
