package com.itheima.demo;
//计算1+2+3....+100的和
public class Demo03_Method {
    public static void main(String[] args){
        int sum =mathSum();
        System.out.println(sum);

    }
    public static int mathSum(){
        int sum = 0;
        for (int i = 1; i<=100; i++){
            sum = sum + i;

        }
        return sum;

    }


}
