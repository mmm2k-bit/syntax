package com.syntax.homework;

public abstract class Card {
    private String CCType;

    public Card(String CCType) {
        this.CCType = CCType;
    }
    public void isActivated(){
        System.out.println("card is activated");
    }
    public abstract void limit();

    public void cancelled(){
        System.out.println("card has been cancelled ");
    }
}
