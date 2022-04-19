package com.syntax.tasks;

public class Students {
    private String studentName;
    private int strudentID;

    public Students(String studentName, int strudentID) {
        this.studentName = studentName;
        this.strudentID = strudentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStrudentID() {
        return strudentID;
    }
}
