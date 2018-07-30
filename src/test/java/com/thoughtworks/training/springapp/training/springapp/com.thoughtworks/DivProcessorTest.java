package com.thoughtworks.training.springapp.training.springapp.com.thoughtworks;

import com.thoughtworks.training.springapp.DivProcessor;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DivProcessorTest {
    @Test
    public void ShouldDivTwoEqualsEvery() {
        assertThat(String.join(" ", new DivProcessor(2).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("0 1 1 2")));

    }

    @Test
    public void ShouldDivNegativeTwoEqualsEvery() {
        assertThat(String.join(" ", new DivProcessor(-2).
                processor(Arrays.asList("1", "2", "3", "4"))),is(("0 -1 -1 -2")));

    }

}
