package com.example.tdd.practice;

import java.util.*;

public class HighestLowest {
    public String minAndMaxOfArray(String s) {
        String result="";

        int[] integerArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        if (integerArray.length == 1){
            result = integerArray[0] + " " + integerArray[0];
        }
        return result;
    }
}
