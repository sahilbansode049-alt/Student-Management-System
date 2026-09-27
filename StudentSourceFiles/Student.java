package model;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double marks;

    public Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void updateStudent(String name, String course, double marks) {
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("------------------------");
    }
}
