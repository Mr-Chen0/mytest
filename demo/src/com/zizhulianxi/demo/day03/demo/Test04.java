package com.zizhulianxi.demo.day03.demo;
//九九乘法表
public class Test04 {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 1 ; i <= 9; i++){
            for(int j = 1 ; j <= i; j++){
                k = i * j;
                System.out.print(i+ "*" +j + "=" +k + " ");
            }
            System.out.println();
        }
    }


}
