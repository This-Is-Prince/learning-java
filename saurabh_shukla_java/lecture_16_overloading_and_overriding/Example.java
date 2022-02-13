package saurabh_shukla_java.lecture_16_overloading_and_overriding;

class A {
    public void f1(int x) {
        System.out.println("Overloading Class A");
    }
}

class B extends A {
    public void f1(int x) {
        System.out.println("Overriding Class B");
    }

    public void f1(int x, int y) {
        System.out.println("Overloading Class B");
    }
}

public class Example {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1(5);
        obj.f1(3, 4);
    }
}
