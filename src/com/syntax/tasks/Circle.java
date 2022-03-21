package com.syntax.tasks;


import java.io.PrintStream;

import static java.lang.Math.*;

public class Circle extends Shape{


    public Circle(double radius) {
        super(radius);
    }

    public double circleArea(){
        double power = Math.pow(super.radius,2);
        double area = power * PI;
        return area;

    }

    public static void main(String[] args) {
        Circle circle=new Circle(23.34);
        double area =circle.circleArea();
        System.out.format("%.2f", area);

    }
}
