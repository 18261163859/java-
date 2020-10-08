package com.shengmingxing;

import java.util.Scanner;

public class Assignment10101005_02 {
    public static void main(String[] args) {
        /**
         * 一年中有 12 个月，而每个月的天数是不一样的。其中大月 31 天，分别为
         * 1,3,5,7,8,10,12 月，小月 30 天，分别 为 4,6,9,11 月。还有二月比较特殊，
         * 平 年的二月只有 28 天，而闰年的二月有 29 天，由用户在控制台输入年份和月份， 程序计算该年该月的天数。
         */

        //接收用户输入
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=scanner.nextInt();
        System.out.println("请输入月份");
        int month=scanner.nextInt();
        int day=0;
        //判断是否为2月
        if(month==2){
            //判断是否为闰年
            if((year%4==0&&year%400!=0)||year%400==0){
                day=29;
            }
            else day=28;
        }
        else{
            switch (month){
                case 1: case 3:case 5:case 7:case 8:case 10:case 12:
                    day=31;break;
                default:day=30;break;

            }
        }

        System.out.println(year+"年"+month+"月的天数是："+day);

    }
}
