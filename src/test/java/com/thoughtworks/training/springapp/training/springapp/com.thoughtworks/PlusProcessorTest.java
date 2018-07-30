package com.thoughtworks.training.springapp.training.springapp.com.thoughtworks;

import com.thoughtworks.training.springapp.PlusProcessor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class PlusProcessorTest {
    @Test
    public void ShouldPlusTwoEqualsEvery() {
        assertThat(String.join(" ", new PlusProcessor(2).
                        processor(Arrays.asList("1", "2", "3", "4"))),is(("3 4 5 6")));

    }
    @Test
    public void ShouldPlusNegativeTwoEqualsEvery() {
        assertThat(String.join(" ", new PlusProcessor(-2).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("-1 0 1 2")));

    }

}