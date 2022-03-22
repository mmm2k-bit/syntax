package com.syntax.tasks;

public class SchoolStudent extends Student{
    @Override
    public void homework(){
        System.out.println("student is doing homework online");
    }
    @Override
    public void funTime(){
        System.out.println("student likes to go to a park");
    }
    public void futureDegree(String subject){
        System.out.println("I want to go to university to study "+subject);
    }
}
