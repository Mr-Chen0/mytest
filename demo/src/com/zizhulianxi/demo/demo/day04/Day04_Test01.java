package com.zizhulianxi.demo.demo.day04;
import java.util.Random;
//随机生成10个100-999之间的随机数（包括100和999），并将随机出来的10个数中是偶数的数字相加,把结果打印到控制台上;
public class Day04_Test01 {
    public static void main(String[] args) {
        //创建随机生成的数
        Random r = new Random();
        //随机生成i个随机数
        for(int i = 1 ; i <= 10 ; i++){
            //随机生成数据
            int numuer = r.nextInt(999)+1;
            //输出数据
            System.out.println("number: " + numuer);
        }

    }


}
