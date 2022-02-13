package saurabh_shukla_java.lecture_17_final_keyword;

final class Dummy {

}

class Dummy1 {
    public void someFunction() {
        System.out.println("Dummy1");
    }

    public final void someFunction1() {
    }
}

class MoreDummy extends Dummy1 {
    public void someFunction() {
        System.out.println("MoreDummy");
    }
    // public void someFunction1() {} // error can't override the final method
}

public class Example {
    private final int x; // final instance member variable
    private final static int y; // final static member variable

    // {
    // x = 5;
    // }

    static {
        y = 5;
    }

    public Example() {
        x = 55;
    }

    public void fun1() {
        final int k; // final local variable
        k = 5;
        System.out.println(k);
        // k = 55; // error
    }

    public void print() {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        System.out.println("-----Final Keyword-----");
    }
}
