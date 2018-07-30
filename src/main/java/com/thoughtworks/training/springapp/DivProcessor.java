package com.thoughtworks.training.springapp;

import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.stream.Collectors;

public class DivProcessor implements Processor {
    private int multiNumber;

    public DivProcessor(int multiNumber) {
        this.multiNumber = multiNumber;
    }

    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen / this.multiNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
