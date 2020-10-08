package com.shengmingxing;

import java.util.Scanner;

public class Assignment10101006 {
    public static void main(String[] args) {
        //选队长游戏

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入总人数：");
        int stuNumber=scanner.nextInt();


        int[] stus=new int[stuNumber];

        int j=0;
        int i=0;
        while(j<stuNumber-1){
            for (int k = 0; k < stuNumber; k++) {
                if(stus[k]==0){
                    i++;
                    if(i==3){
                        j++;
                        i=0;
                        //if(j==stuNumber-1)break;
                        stus[k]=1;

                        for (int q = 0; q < stuNumber; q++) {
                            System.out.print(stus[q]+",");
                        }
                        System.out.println();
                    }
                }
            }
        }

        for (int k = 0; k < stuNumber; k++) {
            if(stus[k]==0)
                System.out.println("队长是原来第"+(k+1)+"位同学");
        }

    }
}
