package com.syntax.tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentCollection {
    public static void main(String[] args) {
        Students stud1 = new Students("John Snow", 101);
        Students stud2 = new Students("John Smith", 102);
        Students stud3 = new Students("John Doe", 103);

        Set<Students> allStuds = new HashSet<>();
        allStuds.add(stud1);
        allStuds.add(stud2);
        allStuds.add(stud3);


        for (Students a:allStuds){
            System.out.println( a.getStudentName());
        }



    }
}

