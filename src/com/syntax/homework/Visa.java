package com.syntax.homework;

public class Visa extends Card{
    public Visa(String CCType) {
        super(CCType);
    }

    @Override
    public void limit() {
        System.out.println("card limit is 500");
    }

    @Override
    public void isActivated() {
        System.out.println("Visa is activated");

    }

    @Override
    public void cancelled() {
        System.out.println("Visa is cancelled ");
    }
}
