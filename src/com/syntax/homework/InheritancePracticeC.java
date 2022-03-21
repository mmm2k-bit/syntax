package com.syntax.homework;

public class InheritancePracticeC extends InheritancePracticeB{
    boolean m;

    public boolean isM() {
        return m;
    }

    public void setM(boolean m) {
        this.m = m;
    }

    public InheritancePracticeC() {
        System.out.println("default 3");
    }

    public static void main(String[] args) {
        InheritancePracticeC ma = new InheritancePracticeC();
        ma.setPrice(56.3);
        ma.setWord("bird");
        ma.setM(true);
        System.out.println(ma.getPrice());
        System.out.println(ma.getWord());
        System.out.println(ma.isM());
    }
}
