package com.itheima.demo;

public class Demo01_Oblong {
    public static void main (String[] args){
    oblong();
    }

    public static void oblong(){
        for(int a = 0; a<5; a++){
            for(int j =1; j < 8; j++) {
                int sum = 0;
                sum = j+sum;
                System.out.print( " "+sum+" " );
            }
            System.out.println();
        }

    }
}
