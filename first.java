package com.mycompany.assignments;

class Person {
    private String name;
    protected int roll;
    protected int marks1;
    protected int marks2;
    protected int marks3;
    protected int marks4;
    protected int marks5;

    public Person(String name, int roll, int marks1, int marks2, int marks3, int marks4, int marks5) {
        this.name = name;
        this.roll = roll;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
        
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Total Marks: " + (marks1+marks2+marks3+marks4+marks5));
        System.out.println("Average Marks: "+ ((marks1+marks2+marks3+marks4+marks5)/5));
    }
}

public class first {

    public static void main(String[] args) {
        Person p1 = new Person("Aditya", 16, 80,65,42,87,90);
        p1.displayInfo();
    }
}
