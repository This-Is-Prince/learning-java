package saurabh_shukla_java.lecture_22_constructor_chaining;

class A {
    public A() {
        System.out.println("A 1");
    }
}

class B extends A {
    public B() {
        this(2);
        System.out.println("B 1");
    }

    public B(int k) {
        super();
        System.out.println("B 2");
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("-----Constructor Chaining-----");
        B o1 = new B();
        System.out.println(o1.getClass());
    }
}
