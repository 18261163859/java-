package com.shengmingxing;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Assignment10101004 {
    public static void main(String[] args) {
        //人工智障

        //实例化Scanner对象
        Scanner scanner=new Scanner(System.in);
        //创建要接收的变量question
        String question;
        while(true){
            //接收输入内容
            question=scanner.next();

            //把"妈"换成""
            question= question.replace("吗","");
            //把"我"换成"我也"
            question=question.replace("我","我也");
            //把"?"换成"!"
            question=question.replace("？","！");

            //输出处理后的内容
            System.out.println(question);
        }
    }
}
