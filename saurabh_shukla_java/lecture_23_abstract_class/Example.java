package saurabh_shukla_java.lecture_23_abstract_class;

abstract class A {

}

class B extends A {

}

public class Example {
    public static void main(String[] args) {
        System.out.println("-----Abstract Class-----");

        A o1 = new B();
        System.out.println(o1.getClass());
    }
}
