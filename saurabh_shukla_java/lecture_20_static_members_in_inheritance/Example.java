package saurabh_shukla_java.lecture_20_static_members_in_inheritance;

class Parent {
    static int y = 4;

    public static void f1() {
        System.out.println("Hello");
    }
}

class Child extends Parent {
    static {
        y = 5;
    }

    public static void f1() {
        System.out.println("Hello From Child");
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("-----Static Members In Inheritance-----");
        System.out.println("y= " + Child.y); // y=4;

        Child.f1();
        System.out.println("y= " + Child.y); // y=5;
    }
}
