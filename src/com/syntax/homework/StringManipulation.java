package com.syntax.homework;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter mom's name");
        String nameM = sca.nextLine();
        System.out.println("Enter dad's name");
        String nameD = sca.nextLine();
        System.out.println("Enter child's gender");
        String gen = sca.nextLine();
        String firsthalf ="";
        String secondhalf ="";
        String babyN;

        if (gen.equalsIgnoreCase("boy")) {
            firsthalf = nameD.substring(0, (nameD.length() / 2));
            secondhalf = nameM.substring(nameM.length() / 2);
        }else if (gen.equalsIgnoreCase("girl")){
            firsthalf = nameM.substring(0, (nameM.length() / 2));
            secondhalf = nameD.substring(nameD.length() / 2);
        }
        babyN = firsthalf.concat(secondhalf);
        System.out.println(babyN);
    }
}

