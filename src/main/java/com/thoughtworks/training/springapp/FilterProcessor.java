package com.thoughtworks.training.springapp;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProcessor implements Processor {
    private int filterNumber;

    public FilterProcessor(int filterNumber) {
        this.filterNumber = filterNumber;
    }


    public List<String> processor(List<String> input) {
        return input.stream().filter(ellen -> Integer.valueOf(ellen) % this.filterNumber != 0)
                .collect(Collectors.toList());
    }
}

