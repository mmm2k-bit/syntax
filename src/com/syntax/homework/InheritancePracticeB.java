package com.syntax.homework;

public class InheritancePracticeB extends InheritancePractice{

    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InheritancePracticeB() {
        System.out.println("second default");
    }


    public static void main(String[] args) {
        InheritancePractice m1 = new InheritancePractice();
        InheritancePracticeB m2 = new InheritancePracticeB();
        m2.setNum(5);
        System.out.println(m2.getNum());

    }
}


