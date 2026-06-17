package com.baidu.day02;

public class Student {

    public static void main(String[] args) {


        byte b1=1;  // -128  127

        System.out.println(Long.MIN_VALUE);  // -9223372036854775808
        System.out.println(Long.MAX_VALUE);  // 9223372036854775807


        System.out.println(Float.MAX_VALUE);  // 3.4028235E38
        System.out.println(Float.MIN_VALUE);  // 1.4E-45

        System.out.println(Double.MIN_VALUE);  // 4.9E-324
        System.out.println(Double.MAX_VALUE);  //1.7976931348623157E308

        float f1=19.4F;  // 默认是double类型  如果要表示数字后加上f或F
        double d1=19.4D;  // 加d或D也可以不加，默认就是double

        boolean b=false;

        char c1='a';        // 97
        char c2='你';
        char c3='\t';       //制表符 TAB   9
        char c4='\u5e05';   // 1个Unicode 字符  帅  24069
        char c5='帅';
        char c6=100;        //   范围0-65535    char类型本质存储的是数值，每个字符对应了一个码值

        System.out.println(c4);
        System.out.println(c5);

        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

        //=================================================================================
        String s="我是一个好人";  //字符串     本质是一个类，不是基本数据类型！
        System.out.println(s);

    }
}
