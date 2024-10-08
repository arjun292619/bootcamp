package com.javaBootCamp.primitives_section2;

public class Primitives {


    public static void main(String[] args) {

        //floating data type declarations and initialization
        float f1 = 33.33f;
        double d1 = 456.454676787d;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        //special cases
        float positiveZero = 0.0f;
        float negativeZero = -0.0f;
        float positiveInfinity = 13.2f / positiveZero;
        float negativeInfinity = 13.2f / negativeZero;
        System.out.println("positiveZero: " + positiveZero);
        System.out.println("positiveInfinity: " + positiveInfinity);
        System.out.println("negativeZero: " + negativeZero);
        System.out.println("negativeInifinity: " + negativeInfinity);

        int num1 = 8;
        float pi = 3.14f;
        int result1 = (int) (num1 * pi);
        float result2 = num1 + pi;
        System.out.println(result1);
        System.out.println(result2);

        //type casting of primitives
        int myintnum = 62;
        double myDouble = myintnum;
        double myDoulbe1 = 6.32d;
        int myint1 = (int) myDoulbe1;
        System.out.println(myDouble);
        int num3 = 256;
        long num2 = 1245678L;
        num1 = (int) num3;



        //overflow and underflow data type declarations and initialization
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        //integer data type declarations and initialization
        byte b1 = 127;
        short s = 3277;
        int i = 14;
        long lnum = 456L;
        long lvalue = 3_123_456_789L;
        System.out.println(lnum);
        System.out.println("lvalue: " + lvalue);
        System.out.println("shortMax: " + Short.MAX_VALUE);
        System.out.println("IntMax: " + Integer.MAX_VALUE);
        System.out.println("LongMax: " + Long.MAX_VALUE);
        System.out.println("shortMin: " + Short.MIN_VALUE);
        System.out.println("intMin: " + Integer.MIN_VALUE);
        System.out.println("LongMin: " + Short.MIN_VALUE);

        //boolean data type declarations and initialization
        boolean isFlag = false;
        int[] integersGroup = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean hasChildren;
        boolean isValid = true;
        boolean isMajor, hasPassport = true;

        //char data type declarations and initialization
        char num = '2';
        char m = 'M';
        char xUnicode = '\u0032';
        char x = 50;
        char c65 = 65;
        char bs = '\\';
        char sq = '\'';
        char dq = '\"';
        System.out.println("num: " + num);
        System.out.println("m: " + m);
        System.out.println("xUnicode: " + xUnicode);
        System.out.println("x: " + x);
        System.out.println("sq: " + sq);
        System.out.println("dq: " + dq);
        System.out.println("c65: " + c65);
        System.out.println(m + num);
        System.out.println(bs);

    }
}
