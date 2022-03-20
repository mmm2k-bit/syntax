package com.syntax.homework;

public class ConstructorMore {
    private int num;
    private double dob;
    private String dtr;

    public ConstructorMore(int num, double dob, String dtr){
        this.num=num;
        this.dob=dob;
        this.dtr=dtr;
    }
    private ConstructorMore(int num, double dob){
        this.num=num;
        this.dob=dob;

    }
    ConstructorMore(){
        System.out.println("hello");
    }
    protected ConstructorMore(int num, String dtr){
        this.num=num;

        this.dtr=dtr;
    }

    public int getNum() {
        return num;
    }

    public double getDob() {
        return dob;
    }

    public String getDtr() {
        return dtr;
    }


    public static void main (String[]args){
        ConstructorMore c1=new ConstructorMore();
        ConstructorMore c2=new ConstructorMore(4,5.6,"bob");
        ConstructorMore c3=new ConstructorMore(6,0.4);
        ConstructorMore c4=new ConstructorMore(6,"wr");
    }
}
