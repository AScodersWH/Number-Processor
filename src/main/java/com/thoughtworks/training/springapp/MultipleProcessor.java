package com.thoughtworks.training.springapp;

import java.util.List;
import java.util.stream.Collectors;

public class MultipleProcessor implements Processor {
    private int multiNumber;

    public MultipleProcessor(int multiNumber) {
        this.multiNumber = multiNumber;
    }

    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen * this.multiNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
