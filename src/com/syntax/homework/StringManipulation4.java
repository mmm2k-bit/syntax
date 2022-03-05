package com.syntax.homework;

public class StringManipulation4 {
    public static void main(String[]args){
        String l = "sdff23432@#$^&&#sdf";
        String a= l.replaceAll("[^A-Za-z0-9]","");
        System.out.println(a.length());
    }
}
