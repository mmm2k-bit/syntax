package com.syntax.homework;

public class StringManipulation3 {
    public static void main (String[]args){
        String m = "Sunday";
        String mm="";
        for (int i=m.length()-1; i>=0; i--){
            mm+=m.charAt(i);
        }
        System.out.println(mm);
    }
}
