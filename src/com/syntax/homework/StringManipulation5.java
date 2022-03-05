package com.syntax.homework;



public class StringManipulation5 {
    public static void main (String[]args){
        String m = "Is it saturday? Is is rainy? is it sunny? or else?";
       String[]a= m.split("[?.!]");
       System.out.println(a.length);


        String mo = "ERRRRRRRRR";
        String ma = "Is it saturday? Is is rainy? is it sunny? or else?";


        System.out.println(mo.concat(ma));
        System.out.println(ma.concat(mo));
        System.out.println(ma.indexOf("E"));
//System.out.println(ma.substring(9));



    }
}
