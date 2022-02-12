package saurabh_shukla_java.lecture_8_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("-----Wrapper Classes-----");
        Boolean b = Boolean.valueOf(true);
        Byte by = Byte.valueOf((byte) 1);
        Character ch = Character.valueOf('c');
        Short sh = Short.valueOf((short) 2);
        Integer i = Integer.valueOf(3);
        Long l = Long.valueOf(4);
        Float f = Float.valueOf((float) 1.4);
        Double d = Double.valueOf(2.4);
        System.out.println(b);
        System.out.println(by);
        System.out.println(ch);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        int a = Integer.parseInt("12");
        System.out.println(a);

        int c = i.intValue();
        System.out.println(c);
    }
}
