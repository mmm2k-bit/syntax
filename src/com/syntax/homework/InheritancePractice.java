package com.syntax.homework;

public class InheritancePractice {
    private int num;
    private String word;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public InheritancePractice() {
        System.out.println("default");
    }
    public static void main(String[] args) {


        InheritancePractice m = new InheritancePractice();
        m.setNum(7);
        System.out.println(m.getNum());
    }

}

