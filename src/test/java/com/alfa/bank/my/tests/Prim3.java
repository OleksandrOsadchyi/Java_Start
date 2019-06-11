package com.alfa.bank.my.tests;

public class Prim3 {
    public static void main(String[] args) {

        //приведення до типу даних Float
        float a = 7;
        a = a + 12.500F;
        System.out.println("a= " + a);

        //приведення до типу даних Long
        long y = 916465456;
        y = y + 1256454565L;
        System.out.println("y= " + y);

        //при приведенні втрачається все що праворуч від коми
        float z = 7;
        z = z + (int) 12.50;
        System.out.println("z= " + z);

        //якась дика хня
        int c = 7;
        c = c + (int) 12.50F;
        System.out.println("c= " + c);

        byte d = 127;
        System.out.println("d= " + d);

        d = (byte) (d + 1);
        System.out.println("d= " + d);

        //Вчимо що таке String
        String s1 = "HELLO";
        System.out.print(s1);
    }
}
