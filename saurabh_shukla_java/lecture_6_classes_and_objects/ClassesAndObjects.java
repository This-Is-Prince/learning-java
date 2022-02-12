package saurabh_shukla_java.lecture_6_classes_and_objects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        System.out.println("----Classes and Objects----");

        Box smallBox = new Box();
        smallBox.setDimension(10, 20, 30);
        smallBox.showDimension();
    }

}

class Box {
    private int length, breadth, height;

    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension() {
        System.out.println("L=" + length);
        System.out.println("B=" + breadth);
        System.out.println("H=" + height);
    }
}
