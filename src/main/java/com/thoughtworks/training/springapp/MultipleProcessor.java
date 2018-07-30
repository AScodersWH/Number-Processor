package com.thoughtworks.training.springapp;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class MultipleProcessor implements Processor {
    private int multiNumber;

    public MultipleProcessor(int multiNumber) {
        this.multiNumber = multiNumber;
    }

    @Override
    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen * this.multiNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
