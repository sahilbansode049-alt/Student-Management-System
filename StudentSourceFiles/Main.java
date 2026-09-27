package main;

import java.util.Scanner;
import model.Student;
import service.StudentService;

class Main {

    public static void main(String aa[]) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        while (true) {

            try {

                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");

                System.out.print("Please Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter ypur Roll Number: ");
                        int rollNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        Student student = new Student(rollNo, name, course, marks);

                        service.addStudent(student);
                        break;

                    case 2:
                        service.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter Roll No: ");
                        rollNo = sc.nextInt();

                        service.searchStudent(rollNo);
                        break;

                    case 4:

                        System.out.print("Enter Roll No: ");
                        rollNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter New Course: ");
                        course = sc.nextLine();

                        System.out.print("Enter New Marks: ");
                        marks = sc.nextDouble();

                        service.updateStudent(rollNo, name, course, marks);

                        break;

                    case 5:
                        System.out.print("Enter Roll No: ");
                        rollNo = sc.nextInt();

                        service.deleteStudent(rollNo);

                        break;

                    case 6:
                        System.out.println("Thank You!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } catch (Exception e) {

                System.out.println("Invalid Input!");
                System.out.println("Please Enter Correct Value.");

                sc.nextLine();

            }
        }
    }
}
