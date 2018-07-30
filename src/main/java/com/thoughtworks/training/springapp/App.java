package com.thoughtworks.training.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public App(List<Processor> pro){
        this.processors = pro;
    }
    private List<Processor> processors;

    public String generateArray(String input) {


        List<String> processes = Arrays.asList(input.split(" "));

        for (Processor pro : processors) {
            processes = pro.processor(processes);
        }

        return String.join(" ",processes);
    }

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
//        List<Processor> result = new ArrayList<>();
//        result.add(new FilterProcessor(2));
//        result.add(new MultipleProcessor(2));
//        result.add(new PlusProcessor(2));
//        result.add(new DivProcessor(2));
//        System.out.print( new App(result).generateArray(scanner.nextLine()));

        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("context.xml"));
        App app = beanFactory.getBean(App.class);
        System.out.print(app.generateArray(scanner.nextLine()));

    }
}
