package com.thoughtworks.training.springapp.training.springapp.com.thoughtworks;

import com.thoughtworks.training.springapp.MultipleProcessor;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleProcessorTest {
    @Test
    public void ShouldMultipleTwoEqualsEvery() {
        assertThat(String.join(" ", new MultipleProcessor(2).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("2 4 6 8")));

    }

    @Test
    public void ShouldMultipleZeroEqualsEveryIsZero() {
        assertThat(String.join(" ", new MultipleProcessor(0).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("0 0 0 0")));

    }

    @Test
    public void ShouldMultipleNegativeThreeEqualsEvery() {
        assertThat(String.join(" ", new MultipleProcessor(-3).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("-3 -6 -9 -12")));

    }



}