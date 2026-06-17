package com.baidu.day02;

/**
 * 变量的定义
 */
public class Demo1 {

    public static void main(String[] args) {

        // 数据类型  变量名  =  初始化值
        //数值
        byte b = 127;
        int age = 18;
        short s = 32767;
        long l = 234234324234234L;  //long类型需要后面添加一个l或者L 代表是长整型

        //字符
        char sex = '男';   //char在计算机底层存储的实质存储是数字， 可以存单个字符   需要用单引号引起来
        char c = 'a';      //可以存单个字符   需要用单引号引起来

        //小数
        float f = 123.45F;  //float需要添加一个f或者F 代表是单精度  默认是double的
        double d = 123.4545D; //double默认就是  可以填加D或者d表示，可以省略

        //布尔
        boolean b1 = true;  //true表示真  false代表假  只能取值true/false

        int money;  //声明变量
        money=100;  //给变量赋值
        System.out.println("钱数是:"+money);
    }
}
