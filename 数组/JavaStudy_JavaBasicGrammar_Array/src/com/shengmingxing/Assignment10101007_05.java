package com.shengmingxing;

public class Assignment10101007_05 {
    public static void main(String[] args) {
        /**
         * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
         * 同时保 持非零元素的相对顺序。
         */

        int[] nums={0,1,0,3,12};

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                if(nums[j]==0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        for (int item : nums) {
            System.out.print(item+",");
        }
    }
}
