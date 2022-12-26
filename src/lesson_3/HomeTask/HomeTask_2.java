package lesson_3.HomeTask;

public class HomeTask_2 {
    public static void main(String[] args) {
        //task 1
        int i1 = 5;
    int i2 = 11;
    double d1 = 5.5;
    double d2 = 1.3;
    long l = 20l;
    double result = i2 / d1 + d2 % i1 -l;
        System.out.println("result_t1_1 = " + result);
        //task 2
        int a = 5;
        int b = 8;
        result = a-- - --a + ++a + a++ + a;
        System.out.println("result_t2_1 = " + result);
        result = ++b - b++ + ++b - --b;
        System.out.println("result_t2_2 = " + result);
        // task 3
        int x = 10;
        int y = 12;
        int z = 3;
        System.out.println("result_t3_1 = " + (x+y - x++*z));
        System.out.println("result_t3_2 = " + (--x - y*5));
        System.out.println("result_t3_3 = " + (y/(x+5%z)));
        System.out.println("result_t3_4 = " + (x++ + y*5));
        System.out.println("result_t3_5 = " + (y - x++*z));
    }
}
