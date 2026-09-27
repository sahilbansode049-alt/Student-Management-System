package service;

import java.util.ArrayList;
import model.Student;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        for (Student st : students) {
            st.displayStudent();
        }
    }

    public void searchStudent(int rollNo) {

        for (Student st : students) {

            if (st.getRollNo() == rollNo) {
                st.displayStudent();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public void updateStudent(int rollNo, String name,
            String course, double marks) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {

                student.updateStudent(name, course, marks);

                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public void deleteStudent(int rollNo) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getRollNo() == rollNo) {

                students.remove(i);

                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}
