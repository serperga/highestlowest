package com.example.tdd.practice;

import java.util.*;

public class HighestLowest {
    public String minAndMaxOfArray(String s) {
        String result="";

        int[] integerArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0;i < integerArray.length;i++){
            integerList.add(integerArray[i]);
        }

        if (integerList.size() == 1){
            result = integerList.get(0).toString() + " " + integerList.get(0).toString();
        }
        return result;
    }
}
