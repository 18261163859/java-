package com.shengmingxing;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Assignment10101007_03 {
    public static void main(String[] args) {
        /**
         * 给定一个整数数组 nums 和一个目标值 target，
         * 请你在该数组中找出和为 目标值的那两个整数，并输出他们的数组下标
         */

        int nums[]={1,3,5,7,9,11,13,17,19};

        System.out.println("请输入目标值target：");
        Scanner scanner=new Scanner(System.in);
        int target=scanner.nextInt();

        haha:for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]== target){
                    System.out.println("他们的下标是:"+i+","+j);
                    break haha;
                }
            }
        }
    }
}
