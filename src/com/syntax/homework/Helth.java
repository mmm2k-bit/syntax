package com.syntax.homework;

public class Helth extends Insurance{
    @Override
    public void getQuote() {
        System.out.println("helth quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel health");

    }
}
