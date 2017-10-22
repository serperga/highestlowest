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

    @Test
    public void arrayHasTwoValuesTest() {
        HighestLowest highestLowest = new HighestLowest();
        String result = highestLowest.minAndMaxOfArray("1 3");
        assertThat(result,is("3 1"));
    }

    @Test
    public void arrayHasTwoEqualsValuesTest() {
        HighestLowest highestLowest = new HighestLowest();
        String result = highestLowest.minAndMaxOfArray("4 4");
        assertThat(result,is("4 4"));
    }

    @Test
    public void arrayHasThreeEqualsValuesTest() {
        HighestLowest highestLowest = new HighestLowest();
        String result = highestLowest.minAndMaxOfArray("4 -10 23");
        assertThat(result,is("23 -10"));
    }
}
