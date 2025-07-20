package Operators;

public class Operators {
    public static void main(String[] args){
        int a = 12;
        int b = 8;
        // int c = a+b;
        // double c = (double) a/b;
        // int c = a%b;
        // a += b;
         int c = a+b;
        System.out.println(c);

        int x = 100;
        int y = 50;
        boolean flag = true;
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x != y);
        System.out.println(x == y);
        System.out.println(flag);
        System.out.println(!flag);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true || true);

        int value1 = 10;
        int value2 = 20;
        System.out.println(~value1);
        System.out.println(value1 << 1);
        System.out.println(value1 >> 1);
        System.out.println(value1 >>> 1); // Unsigned right shift
        System.out.println(value1 & value2);
        System.out.println(value1 | value2);
        System.out.println(value1 ^ value2);

        int p = 10;
        int q = 10;
        p++;
        q--;
        System.out.println(p);
        System.out.println(q);

        int r = 10;
        int s = 10;
        ++r;
        --s;
        System.out.println(r);
        System.out.println(s);

        int  u = 10;
        int v = 5;
        int result = (u > v) ? 20 : 0;
        System.out.println(result);

    }
}
