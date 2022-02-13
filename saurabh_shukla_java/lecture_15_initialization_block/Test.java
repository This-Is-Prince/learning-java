package saurabh_shukla_java.lecture_15_initialization_block;

public class Test {
    private int x;
    private static int k;

    {
        System.out.println("Initialization Block: x=" + x);
        x = 5;
    }
    static {
        System.out.println("Static Initialization Block: k=" + k);
        k = 10;
    }

    public Test() {
        System.out.println("Constructor: x=" + x);
    }

    public static void main(String[] args) {
        System.out.println("-----Initialization Block-----");
        new Test();
        new Test();
        new Test();
    }
}