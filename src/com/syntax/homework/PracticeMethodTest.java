package com.syntax.homework;

public class PracticeMethodTest {

    public static void main (String[]args){
        int[] d = {1,2,3,4,5,6};
        PracticeMethods1 t = new PracticeMethods1();
        System.out.println(t.addArr(d));

        StringBuilder a = new StringBuilder(t.rev("This is reversed"));
        System.out.println(a);
    }
}
