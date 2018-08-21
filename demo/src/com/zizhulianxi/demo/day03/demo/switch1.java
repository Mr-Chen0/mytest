package com.zizhulianxi.demo.day03.demo;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个1-5的数： ");
        int number = s.nextInt();
        if(number >= 1 && number <= 5){
            switch (number){
                case 1 :
                    System.out.println("新建");
                    break;
                case 2 :
                    System.out.println("打开文件");
                    break;
                case 3:
                    System.out.println("保存");
                    break;
                case 4:
                     System.out.println("刷新");
                     break;
                case 5:
                    System.out.println("退出");
                    break;
                 default:
                     System.exit(0);
                     break;
            }
        }

    }

}
