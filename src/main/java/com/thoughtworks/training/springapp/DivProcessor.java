package com.thoughtworks.training.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
@Profile("2")
public class DivProcessor implements Processor {
    private int multiNumber;

    public DivProcessor(@Value("2") String profile) {
        this.multiNumber = multiNumber;
    }

    @Override
    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen / this.multiNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
