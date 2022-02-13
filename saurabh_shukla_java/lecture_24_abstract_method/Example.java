package saurabh_shukla_java.lecture_24_abstract_method;

abstract class Person {
    abstract void show();
}

class Student extends Person {
    void show() {
        System.out.println("Student Class");
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("-----Abstract Methods-----");
        new Student().show();
    }
}
