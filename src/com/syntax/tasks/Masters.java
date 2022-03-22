package com.syntax.tasks;

public class Masters extends Degree{
    @Override
    public void getPrerequisite(){
        System.out.println("To get a degree you need bachelors degree");
    }

    public static void main(String[] args) {
        Degree d = new Degree();
        Bachelors b = new Bachelors();
        Masters m = new Masters();
        d.getPrerequisite();
        b.getPrerequisite();
        m.getPrerequisite();
    }
}
