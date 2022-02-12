package saurabh_shukla_java.lecture_12_access_modifiers;

public class Example { // outer class
    private int x;

    public void fun() {
        x = 0;
        System.out.println(x);
    }

    private class Dummy1 { // inner class

    }

    protected class Dummy2 { // inner class
        public Dummy1 dummy1 = new Dummy1();
    }

    public class Dummy3 { // inner class

    }

    class Dummy4 { // inner class

    }
}
