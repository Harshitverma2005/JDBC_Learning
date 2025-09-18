package com.example.SpringWithJDBC.Model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name ;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", rollNo=").append(rollNo);
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }

    
}
