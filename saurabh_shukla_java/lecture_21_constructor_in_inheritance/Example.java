package saurabh_shukla_java.lecture_21_constructor_in_inheritance;

class A {
    int a;

    public A(int x) {
        a = x;
        System.out.println("A Constructor");
    }
}

class B extends A {
    int b;

    public B() {
        super(100);
        System.out.println("b Constructor");
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("-----Constructor In Inheritance-----");

        B obj = new B();
        System.out.println(obj.a);
    }
}
