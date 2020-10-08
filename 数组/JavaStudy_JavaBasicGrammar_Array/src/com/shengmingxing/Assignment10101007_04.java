package com.shengmingxing;

public class Assignment10101007_04 {
    public static void main(String[] args) {
        /**
         * 对数组{1，3，9，5，6，7，15，4，8}进行排序，
         * 然后使用二分查找 6 并输出排序后的下标。
         */

        //定义数组
        int nums[]={1,3,9,5,6,7,15,4,8};

        //排序
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for (int item : nums) {
            System.out.print(item+",");
        }

        //二分法查找6的下标
        int min=0;
        int max=nums.length;
        int mid=(min+max)/2;

        while (true){
            if(nums[mid]>6){
                max=mid-1;
            }
            else if(nums[mid]<6){
                min=mid+1;
            }
            else{
                System.out.println("下标为："+mid);
                break;
            }
            if(min>max){
                System.out.println("未找到");
            }
            mid=(min+max)/2;

        }

    }
}
