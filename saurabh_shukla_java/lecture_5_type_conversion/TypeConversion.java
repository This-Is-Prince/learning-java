package saurabh_shukla_java.lecture_5_type_conversion;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("-----Type Conversion-----");

        // int y = 3;
        // float x = y; // Widening Conversion, no error

        float x = 3.4f;
        // int y=x; // narrowing conversion, error

        int y = (int) x; // no error typecasting

        // float k = 3.5; // narrowing conversion, error
        float k = 3.5f; // no error

        System.out.println(y);
        System.out.println(k);
    }
}
