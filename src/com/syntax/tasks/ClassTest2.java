package com.syntax.tasks;

import com.syntax.homework.Student;

public class ClassTest2 {

    public static void main (String[]args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();

        stud1.setName("tom");
        stud2.setName("sam");
        stud3.setName("bob");

        stud1.setID(1);
        stud2.setID(2);
        stud3.setID(3);

        stud1.addStud();
        stud2.addStud();
        stud3.addStud();
        System.out.println(Student.NumOfStudents);


    }
    }

