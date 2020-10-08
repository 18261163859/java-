package com.shengmingxing;

import java.util.concurrent.ForkJoinPool;

public class Assignment10101005_03 {
    //输出三个图形
    public static void main(String[] args) {
        drawGraph1();
        System.out.println();
        drawGraph2();
        System.out.println();
        drawGraph3();
    }

    //画第一个图形
    public static  void drawGraph1(){
        for(int i=0;i<6;i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //画第二个图形
    public static void drawGraph2(){
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //画第三个图形
    public static void drawGraph3(){
        for (int i = 0; i < 5; i++) {
            for (int k = 4-i; k >0 ; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
