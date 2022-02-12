package saurabh_shukla_java.lecture_7_static_members;

public class StaticMembers {
    int x; // Instance variable
    static int y; // static member variable

    public void fun1() { // static int a; // Error
    } // instance member function

    public static void fun2() {
    } // static member function

    static class Test {
        public static String country = "INDIA";
    }

    public static void main(String[] args) {
        StaticMembers ex1 = new StaticMembers();
        StaticMembers ex2 = new StaticMembers();
        System.out.println(ex1.x);
        System.out.println(ex2.x);
        System.out.println(y);
        y = 5;
        System.out.println(y);
        fun2();
        System.out.println(Test.country);
    }
}
