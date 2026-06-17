package com.baidu.day02;

//2.导入这个系统工具类
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        //1.创建一个输入类对象，负责从键盘接受信息
        Scanner input=new Scanner(System.in);

        System.out.print("请输入您的姓名:");
        String name=input.next(); //键盘接受用户输入姓名

        System.out.print("请输入年龄:");
        int age=input.nextInt();

        System.out.print("请输入工作年份:");
        int year=input.nextInt();

        System.out.print("请输入专业:");
        String major=input.next();

        System.out.print("请输入爱好:");
        String hobby=input.next();

        System.out.println("我是:"+name);
        System.out.println("今年"+age+"岁");
        System.out.println("已经工作"+year+"年了");
        System.out.println("个人爱好是:"+hobby);
    }
}
