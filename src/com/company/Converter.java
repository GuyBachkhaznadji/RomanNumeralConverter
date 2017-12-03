package com.company;

import java.util.ArrayList;

public class Converter {
    private ArrayList<String> numerals;
    private ArrayList<Integer> numeralInts;

    public Converter() {
        this.numerals = new ArrayList<String>();
        this.numeralInts = new ArrayList<Integer>();
        this.numerals.add("I");
        this.numerals.add("V");
        this.numerals.add("X");
        this.numerals.add("L");
        this.numerals.add("C");
        this.numeralInts.add(1);
        this.numeralInts.add(5);
        this.numeralInts.add(10);
        this.numeralInts.add(50);
        this.numeralInts.add(100);
    }

    public String convertInt(int num){
        Integer index = numerals.size() - 1;
        String convertedNumerals = "";

        for (int i = index; i > -1 ; i--) {
            int division = num / this.numeralInts.get(i);
            int remainder = num % this.numeralInts.get(i);

            for (int x = division; x > 0 ; x--) {
                convertedNumerals += this.numerals.get(i);
            }
            num = remainder;
        }
    return convertedNumerals;
    }
}
