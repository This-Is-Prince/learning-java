package saurabh_shukla_java.lecture_11_use_of_import.pack1;

import saurabh_shukla_java.lecture_11_use_of_import.pack2.Student;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(44);
        s1.setName("Prince");
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
    }
}
