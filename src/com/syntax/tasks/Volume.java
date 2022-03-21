package com.syntax.tasks;

public class Volume {
    public double volume(double width, double length){
        return width*length;
    }
    public double volume(double side){

          double ares=      Math.pow(side,2);
          return ares;
    }
    public double volume(double width, double length,double height){
        return width*length*height;
    }

    public static void main(String[] args) {
        Volume v = new Volume();
        System.out.println("area of square "+v.volume(2));
        System.out.println("aera of rectangle "+ v.volume(23.4,34.67));
        System.out.println("volume of the box "+v.volume(56,23.4,6.1));

    }
}
