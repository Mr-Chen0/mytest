package com.itheima.demo;
//重载：在同一个类中，允许有一个或一个以上的相同名称的方法，参数列表不同即可，与修饰符和返回值无关。
// 参数列表：个数不同，数据类型不同，顺序不同
//重载方法调用：jvm通过方法参数列表的不同，调用不同的方法。
public class Demo05_ChongZhai {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        byte c = 3;
        byte d = 4;
        double e = 5.0;
        int f = 5;
        char o = 'k';
        int p = 5;
        System.out.println(campare(a,b));
        System.out.println(campare(c,d));
        System.out.println(campare(e,f));
        System.out.println(campare(o,p));
    }

    public static boolean campare(int a , int b){
        System.out.print("int: ");
        return a == b;
    }

    public static boolean campare(byte a , byte b){
        System.out.print("byte: ");
        return a == b;
    }

    public static boolean campare(double a , int b){
        System.out.print("double: ");
        return a == b;
    }

    public static boolean campare(char a , int b){
        System.out.print("char: ");
        return a == b;
    }
}
