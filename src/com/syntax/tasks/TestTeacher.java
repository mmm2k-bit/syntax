package com.syntax.tasks;

import com.syntax.homework.ChemistryTeacher;
import com.syntax.homework.MathTeacher;
import com.syntax.homework.PianoTeacher;
import com.syntax.homework.Teacher;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Smith");
        teacher.gradeHomwork();
        System.out.println(teacher.getFname());
        System.out.println(Teacher.schoolName);
        MathTeacher mathTeacher = new MathTeacher("qot", "milk",34);
        mathTeacher.gradeHomwork();
        System.out.println(mathTeacher.getFname());

        mathTeacher.setNumStudents(123);
        System.out.println(mathTeacher.getNumStudents());
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("john","snow", 234.34,"none");
        chemistryTeacher.gradeHomwork();
        System.out.println(chemistryTeacher.getFname());
        PianoTeacher pianoTeacher = new PianoTeacher("sdfsdf","sdsfs","piano", 345);
        pianoTeacher.gradeHomwork();
        System.out.println(pianoTeacher.getFname());
        System.out.println(pianoTeacher.getHours());
    }
}
