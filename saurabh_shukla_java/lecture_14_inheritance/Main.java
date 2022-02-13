package saurabh_shukla_java.lecture_14_inheritance;

class Person {
    private int age;
    private String name;

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}

class Student extends Person {
    private int rollNo;

    public void setRollNo(int r) {
        this.rollNo = r;
    }

    public int getRollNo() {
        return this.rollNo;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Inheritance-----");

        Student s1 = new Student();
        s1.setRollNo(44);
        s1.setName("Prince");
        s1.setAge(22);
        System.out.println("RollNo : " + s1.getRollNo());
        System.out.println("Age : " + s1.getAge());
        System.out.println("Name : " + s1.getName());
    }
}
