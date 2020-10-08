package com.shengmingxing;

public class Assignment10101005_05 {
    public static void main(String[] args) {
        //打印三位数中的所有水仙花数
        for (int i = 100; i < 1000; i++) {
            int gewei=i%10;//个位
            int shiwei=i%100/10;//十位
            int baiwei=i/100;//百位

            if(Math.pow(gewei,3)+Math.pow(shiwei,3)+Math.pow(baiwei,3)==i){
                System.out.print(i+" ");
            }
        }
    }
}
