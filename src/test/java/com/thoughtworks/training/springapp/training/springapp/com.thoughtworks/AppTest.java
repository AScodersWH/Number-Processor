package com.thoughtworks.training.springapp.training.springapp.com.thoughtworks;
import com.sun.tools.corba.se.idl.constExpr.Plus;
import com.thoughtworks.training.springapp.*;
import com.thoughtworks.training.springapp.App;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppTest{
    @Test
    public void ShouldThreeCaseEqualsEvery() {
        PlusProcessor plusProcessor = new PlusProcessor(2);
        MultipleProcessor multipleProcessor = new MultipleProcessor(2);
        FilterProcessor filterProcessor = new FilterProcessor(3);
        List<Processor> pro = new ArrayList<>();
        pro.add(filterProcessor);
        pro.add(multipleProcessor);
        pro.add(plusProcessor);
        assertThat(new App(pro) .generateArray("1 2 3 4"),is(("4 6 10")));

    }
}
