package com.zizhulianxi.demo.day03.demo;

public class AA {
    public static void main(String[] args) {
        int count = 0 ;
        for (int i = 1 ; i < 100 ; i++){
            int ge = i % 10 ;
            int shi = i / 10 % 10 ;
            if(ge != 9 && shi != 9){

                System.out.print(i + " ");
                count++;
                if(count % 5 == 0){
                    System.out.println();
                }
            }

        }

        }
    }


