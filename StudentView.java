package view;



import Data.Student;

public class StudentView {

    public static void printStudent(Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("ID: " + student.getId());
        System.out.println();
    }
}