package com.shengmingxing;

import java.util.Scanner;

public class Assignment10101005_01 {
    public static void main(String[] args) {
        /**
         * 1、计算应缴金额
         * 商场根据会员积分打折:
         * 2000 分以内打 9 折，
         * 4000 分以内打 8 折，
         * 8000 分以内打 7.5 折，
         * 8000 分以上打 7 折，使用 if-else-if 结构，实现手动输入购物金额和积分，
         * 计算出应缴金额
         */

        //初始化Scanner
        Scanner scanner=new Scanner(System.in);

        //输入金额和积分
        double totalPrice=0.0;
        int totalPoint=0;
        System.out.println("请输入购物金额");
        if(scanner.hasNextDouble()) {
            totalPrice = scanner.nextInt();
        }

        System.out.println("请输入积分");
        if(scanner.hasNextInt()) {
            totalPoint = scanner.nextInt();
        }


        if(totalPrice!=0&&totalPoint!=0) {
            //2000 分以内打 9 折
            if (totalPoint < 2000) {
                totalPrice *= 0.9;
            }
            //4000 分以内打 8 折
            else if (totalPoint < 4000) {
                totalPrice *= 0.8;
            }
            //8000 分以内打 7.5 折
            else if (totalPoint < 8000) {
                totalPrice *= 0.75;
            }
            //8000 分以上打 7 折
            else {
                totalPrice *= 0.7;
            }


            System.out.println("应缴金额：" + totalPrice);
        }


    }
}
