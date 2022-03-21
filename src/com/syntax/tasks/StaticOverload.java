package com.syntax.tasks;

public class StaticOverload {
    static void test(){
        System.out.println("static no param");
    }
    static void test(int num){
        System.out.println("static int param"+ num);
    }
    static void test(String s){
        System.out.println("static string param"+s);
    }

    public static void main(String[] args) {
        StaticOverload.test();
        StaticOverload.test(5);
        StaticOverload.test("we");
    }
}
