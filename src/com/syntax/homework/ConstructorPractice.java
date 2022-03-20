package com.syntax.homework;

public class ConstructorPractice {

        private String name;
        private int age;
        private double money;

        public ConstructorPractice(){
            System.out.println("This is an empty constructor");
        }

        public ConstructorPractice(String name, int age, double money){
            this.name=name;
            this.age=age;
            this.money=money;

        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }
}
