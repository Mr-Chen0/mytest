package com.zizhulianxi.demo.day03.demo;
//水仙花:  ijk = i*i*i + j*j*j + k*k*k = ijk
public class Test05 {
    public static void main(String[] args) {
        for(int a = 100 ; a < 1000 ; a++){
            int k = a % 10 ;
            int j = a / 10 %10;
            int i = a / 100   ;
            int sum = i*i*i + j*j*j + k*k*k;
            if (sum == a ){
                System.out.println( a+ " 此数为水仙花数");
            }

        }


    }
}
