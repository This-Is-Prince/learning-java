package saurabh_shukla_java.lecture_18_this_keyword;

class Box {
    private int l, b, h;

    public void setDimension(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void showDimension() {
        System.out.println(this.l + ", " + this.b + ", " + this.h);
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("-----This Keyword-----");
        Box b1 = new Box();
        b1.setDimension(12, 10, 5);
        b1.showDimension();
    }
}
