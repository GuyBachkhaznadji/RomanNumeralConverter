package com.company;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ConverterTest {
    Converter converter;

    @Before
    public void before(){
        converter = new Converter();
    }

    @Test
    public void convertToNumeral1(){
        String numeral = converter.convertInt(1);
        assertEquals("I", numeral);
    }

    @Test
    public void convertToNumeral23(){
        String numeral = converter.convertInt(23);
        assertEquals("XXIII", numeral);
    }

    @Test
    public void convertToNumeral7(){
        String numeral = converter.convertInt(7);
        assertEquals("VII", numeral);
    }

    @Test
    public void convertToNumeral153(){
        String numeral = converter.convertInt(153);
        assertEquals("CLIII", numeral);
    }

}