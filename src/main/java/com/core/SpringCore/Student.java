package com.core.SpringCore;

public class Student {
    private String studentName;
    private int studentRoll;
    private String studentEmail;

    // Default constructor
    public Student() {
    }

    // Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for studentRoll
    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    // Getter and Setter for studentEmail
    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRoll=" + studentRoll +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
