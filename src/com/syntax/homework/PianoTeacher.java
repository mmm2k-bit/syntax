package com.syntax.homework;

public class PianoTeacher extends Teacher{
    @Override
    public void gradeHomwork(){
        System.out.println("Piano teacher is grading ");
    }
    String subject;
    int hours;

    public PianoTeacher(String fname, String lname, String subject, int hours) {
        super(fname, lname);
        this.subject = subject;
        this.hours = hours;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public PianoTeacher(String subject) {
        super("ron", "swanson");

        this.subject = subject;
    }
}
