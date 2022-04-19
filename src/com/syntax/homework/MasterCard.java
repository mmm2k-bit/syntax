package com.syntax.homework;

public class MasterCard extends Card{
    public MasterCard(String CCType) {
        super(CCType);
    }

    @Override
    public void isActivated() {
        System.out.println("Mastercard is activated");
    }


    public void limit() {
        System.out.println("Mastercard limit is 1000");
    }

    @Override
    public void cancelled() {
        System.out.println("Mastercard is cancelled");
    }
}
