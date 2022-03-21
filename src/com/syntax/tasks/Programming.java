package com.syntax.tasks;

public class Programming {
    String lang;
    public Programming() {
        System.out.println("I love programming languages.");
    }

    public Programming(String lang) {
        this.lang = lang;
        System.out.println("I love "+lang);
    }

    public static void main(String[] args) {
        Programming p = new Programming("java");
        Programming p1 = new Programming();
    }
}
