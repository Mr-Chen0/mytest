package com.itheima.demo;
//实现不定次数的打印HelloWorld
public class Demo04_Method {
    public static void main(String[] args){
       helloWorld(10);
    }

    public static void helloWorld( int a  ){
        for(int i = 1; i <= a;i++){
            System.out.println("HelloWorld"+i);
        }

    }
}
