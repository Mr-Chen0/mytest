package com.zizhulianxi.demo.lianxi.demo;

public class Continue {
    public static void main (String[] args){
        for(int i = 1;i<=6;i++){
            if(i == 3){
                //break;
                System.out.println("==");
                continue;
            }
            for(int j = 1; j < 10; j++){
                if(j == 5){
                    //break;
                    System.out.print("*");
                    continue;
                }
                System.out.print(j);
            }
				 /* if(i == 3){
					//break;
					System.out.println("==");
					continue;
				} */
            System.out.println(" ");
        }

    }
}
