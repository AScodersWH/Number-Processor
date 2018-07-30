package com.thoughtworks.training.springapp;

import java.util.List;
import java.util.stream.Collectors;

public class PlusProcessor implements Processor {
    private int plusNumber;

    public PlusProcessor(int plusNumber) {
        this.plusNumber = plusNumber;
    }

    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen + this.plusNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
