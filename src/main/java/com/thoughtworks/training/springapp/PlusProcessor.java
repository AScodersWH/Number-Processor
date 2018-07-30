package com.thoughtworks.training.springapp;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class PlusProcessor implements Processor {
    private int plusNumber;

    public PlusProcessor(int plusNumber) {
        this.plusNumber = plusNumber;
    }

    @Override
    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen + this.plusNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
