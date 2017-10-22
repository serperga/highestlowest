package com.example.tdd.practice;

import java.util.*;
import java.util.stream.IntStream;

public class HighestLowest {

    public String minAndMaxOfArray(String s) {
        String result="";

        int[] integerArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        IntSummaryStatistics statisticsIntArray = IntStream.of(integerArray).parallel().summaryStatistics();

        int min = findLowInArray(statisticsIntArray);
        int max = findMaxInArray(statisticsIntArray);
        result = composeResult(max,min);
        return result;
    }

    private int findLowInArray(IntSummaryStatistics intSummaryStatistics){
        int min = intSummaryStatistics.getMin();
        return min;
    }

    private int findMaxInArray(IntSummaryStatistics intSummaryStatistics){
        int max = intSummaryStatistics.getMax();
        return max;
    }

    private String composeResult(int max, int min){
        String result = max + " " + min;
        return result;
    }
}
