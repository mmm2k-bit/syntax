package com.syntax.homework;

public class Car extends Insurance{
   private String carModel;

    @Override
    public void getQuote() {
        System.out.println("car quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("canccel car insur");

    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
