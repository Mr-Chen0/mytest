package com.zizhulianxi.demo.day03.demo;
import java.util.Scanner;
/*
 * 	从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
          1.数字的个位数不为7;
          2.数字的十位数不为5;
          3.数字的百位数不为3;
 */
public class Test02 {
    public static void main(String[] args) {
//		TODO 在此填写完代码，保证程序按要求执行
        int sum = 0;

        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个三位数：  ");
        int num = a.nextInt();
        do {
            if (num < 100 || num >= 1000) {
                System.out.println("输入有误！请重新输入");
                num = a.nextInt();
            }
        }while (num < 100 || num >= 1000);
        for (int i = 100; i <= num; i++) {
            if (i % 10 != 7 && i % 100 / 10 != 5 && i / 100 != 3) {
                sum += i;
            }
        }
        System.out.println(sum);


    }
}
