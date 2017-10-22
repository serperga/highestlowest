package com.example.tdd.practice;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HighestLowestTest {

    @Test
    public void arrayHasOneValueTest() {
        HighestLowest highestLowest = new HighestLowest();
        String result = highestLowest.minAndMaxOfArray("1");
        assertThat(result,is("1 1"));
    }
}
