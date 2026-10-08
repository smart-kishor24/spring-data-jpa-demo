package com.example.spring_core_di;


public class Student {

	private final Courses courses;

    public Student(Courses course) {
        this.courses = course;
    }

    public void displayDetails() {
        System.out.println("Student: Chandan");
        System.out.println("Courses: " + courses.getCourseName());
    }
} 