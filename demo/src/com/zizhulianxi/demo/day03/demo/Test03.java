package com.zizhulianxi.demo.day03.demo;
import java.util.Scanner;
/*
 * 分析以下需求，并用代码实现：
    1.功能描述:键盘录入月份，输出对应的季节
    2.要求:
        (1)键盘录入一个整数(代表月份,范围1-12)
        (2)输出该月份对应的季节
            3,4,5春季
            6,7,8夏季
            9,10,11秋季
            12,1,2冬季
        (3)演示格式如下:
            请输入一个月份:3
            控制台输出:3月份是春季
 */
public class Test03 {
        public static void main(String[] args) {
//		TODO 在此填写完代码，保证程序按要求执行
            Scanner s = new Scanner(System.in);
            System.out.println("请输入一个月份： ");
            int num = s.nextInt();
            while (num < 1 || num > 12){
                System.out.println("您输入月份有误，请重新输入");
                num = s.nextInt();
            }
                if (num >= 3 && num <= 5) {
                    System.out.println(num + "月份是春季");
                } else if (num >= 6 && num <= 8) {
                    System.out.println(num + "月份是夏季");
                } else if (num >= 9 && num <= 11) {
                    System.out.println(num + "月份是秋季");
                } else {
                    System.out.println(num + "月份是冬季");
                }


        }

}
