package com.shengmingxing;

import java.util.Scanner;

public class Assignment10101007_02 {
    public static void main(String[] args) {
        /**
         * 定义一个长度为 10 的整型数组 nums ，循环输入 10 个整数。输出数组 的最大值、最小值。
         */

        //定义数组、变量
        int[] nums=new int[10];
        int min,max;

        //输入
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入10个数：");
        for (int i = 0; i < 10; i++) {
            nums[i]=scanner.nextInt();
        }

        //初始化变量
        min=max=nums[0];

        //找到最小值
        for (int j = 1; j < nums.length; j++) {
            if(min>nums[j]){
                min=nums[j];
            }
        }
        System.out.println("最小值是："+min);

        //找到最大值
        for (int k = 1; k < nums.length; k++) {
            if(max<nums[k]){
                max=nums[k];
            }
        }
        System.out.println("最大值是："+max);

    }
}
