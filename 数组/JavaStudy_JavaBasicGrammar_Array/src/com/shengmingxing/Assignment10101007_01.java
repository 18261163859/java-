package com.shengmingxing;

import java.util.Scanner;

public class Assignment10101007_01 {
    public static void main(String[] args) {
        /**
         * 定义一个长度为 10 的整型数组 nums ，循环输入 10 个整数。
         * 然后将输 入一个整数，查找此整数，找到输出下标， 没找到给出提示。
         */

        int[] nums=new int[10];//定义数组

        //输入
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入10个整数");
        for (int i = 0; i < 10; i++) {
            nums[i]=scanner.nextInt();
        }
        System.out.println("请输入要查找的数：");
        int num=scanner.nextInt();

        //遍历查找
        for (int j = 0; j < 10; j++) {
            if(nums[j]==num){
                System.out.println("下标是"+j);
                break;
            }
            if(j==9){
                System.out.println("未找到此数！");
            }
        }

    }
}
