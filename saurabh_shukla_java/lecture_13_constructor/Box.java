package saurabh_shukla_java.lecture_13_constructor;

public class Box {
    private int l, b, h;

    public Box() {
        l = 10;
        b = 8;
        h = 4;
    }

    public Box(int L, int B, int H) {
        l = L;
        b = B;
        h = H;
    }

    public void display() {
        System.out.print(this.l + ", " + this.b + ", " + this.h);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("-----Constructor-----");
        Box b1 = new Box();
        b1.display();
        Box b2 = new Box(20, 15, 5);
        b2.display();
    }
}