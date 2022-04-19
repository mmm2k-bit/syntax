package com.syntax.homework;

public class AMEX extends Card{
    public AMEX(String CCType) {
        super(CCType);
    }

    @Override
    public void isActivated() {
        System.out.println("AMEX is activated");
    }


    public void limit() {
        System.out.println("AMEX limit is 5000");

    }

    @Override
    public void cancelled() {
        System.out.println("AMEX is cancelled");
    }
}
