package com.thoughtworks.training.springapp.training.springapp.com.thoughtworks;

import com.thoughtworks.training.springapp.FilterProcessor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FilterProcessorTest {
    @Test
    public void ShouldFilterByTwoEqualsEvery() {
        assertThat(String.join(" ", new FilterProcessor(2).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("1 3")));

    }

    @Test
    public void ShouldFilterByThreeEqualsEvery() {
        assertThat(String.join(" ", new FilterProcessor(3).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("1 2 4")));

    }
}