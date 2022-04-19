package com.syntax.homework;

public class Pet extends Insurance{
    private String petType;

    @Override
    public void getQuote() {
        System.out.println("pet quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel pet insur");

    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
