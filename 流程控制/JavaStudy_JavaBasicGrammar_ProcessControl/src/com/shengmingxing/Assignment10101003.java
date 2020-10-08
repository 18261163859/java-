package com.shengmingxing;

import java.util.Scanner;

public class Assignment10101003 {
    public static void main(String[] args) {
        //出租车计费训练任务

        //初始化模型对象
        ChargeInfoModel chargeInfoModel=new ChargeInfoModel();

        //输入信息
        inputInfo(chargeInfoModel);

        //计算价格
        calculateTotalPrice(chargeInfoModel);

        //输出价格
        System.out.println("总价格是："+String.format("%.2f",chargeInfoModel.getTotalPrice()));



    }

    //输入信息
    public static void inputInfo(ChargeInfoModel chargeInfoModel){
        Scanner scanner=new Scanner(System.in);
        //接收数据
        System.out.println("请输入公里数：");
        chargeInfoModel.setKilometer(scanner.nextInt());//公里数
        System.out.println("请输入总乘车时间（min）");
        chargeInfoModel.setTotalRideTime(scanner.nextInt());
        System.out.println("请输入是否预约叫车(true/false)");
        chargeInfoModel.setIfHasAppoint(scanner.nextBoolean());
        if(chargeInfoModel.getIfHasAppoint()){
            System.out.println("请输入是否预约叫车的时间在4小时以内(true/false)");
            chargeInfoModel.setIfAppointTimeWithinFourHour(scanner.nextBoolean());
        }
        System.out.println("请输入是否有低速行驶(true/false)");
        chargeInfoModel.setIfHasLowSpeedDrive(scanner.nextBoolean());
        if(chargeInfoModel.getIfHasLowSpeedDrive()){
            System.out.println("请输入早晚高峰期低速行驶时长");
            chargeInfoModel.setLowSpeedDriveTimeWithRushTime(scanner.nextInt());
            System.out.println("请输入其他时间低速行驶时长");
            chargeInfoModel.setLowSpeedDriveTimeWithNormalTime(scanner.nextInt());
        }
        if(chargeInfoModel.getKilometer()>15){
            System.out.println("是否往返（true/false）");
            chargeInfoModel.setIfGoAndBack(scanner.nextBoolean());
        }
    }

    //计算总价格
    public static void calculateTotalPrice(ChargeInfoModel chargeInfoModel){
        double totalPrice=0.0;//总价格
        double basicPriceRate=1.0;//基本单价比例

        //判断总里程是否在3公里以内
        if(chargeInfoModel.getKilometer()<3){
            totalPrice=13;
        }
        else
        {
            int extraKilometer=chargeInfoModel.getKilometer()-3;//3公里以外的公里数

            //判断是否有低速行驶
            if(chargeInfoModel.getIfHasLowSpeedDrive()){
                //每5分钟早晚高峰期间加收2公里基本单价
                extraKilometer+=(chargeInfoModel.getLowSpeedDriveTimeWithRushTime()/5)*2;
                //每5分钟其它时间段加收1公里基本单价
                extraKilometer+=chargeInfoModel.getLowSpeedDriveTimeWithNormalTime()/5;
            }

            //判断是否有预约叫车服务费
            if(chargeInfoModel.getIfHasAppoint()){
                if(chargeInfoModel.getIfAppointTimeWithinFourHour())totalPrice+=5;else totalPrice+=6;
            }

            //判断是否有空驶费
            if(!chargeInfoModel.getIfGoAndBack()) {
                basicPriceRate *= 1.5;
            }

            //计算总价格
            totalPrice=13+2.3*basicPriceRate*extraKilometer;

        }

        chargeInfoModel.setTotalPrice(totalPrice);


    }


}

//缴费信息
class ChargeInfoModel{
    private int kilometer;//公里数
    private int totalRideTime;//总乘车时间
    private boolean ifHasAppoint;//是否预约叫车
    private boolean ifAppointTimeWithinFourHour;//预约叫车的时间是否在4小时以内
    private boolean ifHasLowSpeedDrive;//是否有低速行驶
    private int lowSpeedDriveTimeWithRushTime;//早晚高峰期低速行驶时长
    private int lowSpeedDriveTimeWithNormalTime;//其他时间低速行驶时长
    private boolean ifGoAndBack;//是否往返
    private double totalPrice;//总费用

    public boolean getIfHasAppoint() {
        return ifHasAppoint;
    }

    public void setIfHasAppoint(boolean ifHasAppoint) {
        this.ifHasAppoint = ifHasAppoint;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public int getTotalRideTime() {
        return totalRideTime;
    }

    public void setTotalRideTime(int totalRideTime) {
        this.totalRideTime = totalRideTime;
    }

    public boolean getIfAppointTimeWithinFourHour() {
        return ifAppointTimeWithinFourHour;
    }

    public void setIfAppointTimeWithinFourHour(boolean ifAppointTimeWithinFourHour) {
        this.ifAppointTimeWithinFourHour = ifAppointTimeWithinFourHour;
    }

    public boolean getIfHasLowSpeedDrive() {
        return ifHasLowSpeedDrive;
    }

    public void setIfHasLowSpeedDrive(boolean ifHasLowSpeedDrive) {
        this.ifHasLowSpeedDrive = ifHasLowSpeedDrive;
    }

    public int getLowSpeedDriveTimeWithRushTime() {
        return lowSpeedDriveTimeWithRushTime;
    }

    public void setLowSpeedDriveTimeWithRushTime(int lowSpeedDriveTimeWithRushTime) {
        this.lowSpeedDriveTimeWithRushTime = lowSpeedDriveTimeWithRushTime;
    }

    public int getLowSpeedDriveTimeWithNormalTime() {
        return lowSpeedDriveTimeWithNormalTime;
    }

    public void setLowSpeedDriveTimeWithNormalTime(int lowSpeedDriveTimeWithNormalTime) {
        this.lowSpeedDriveTimeWithNormalTime = lowSpeedDriveTimeWithNormalTime;
    }

    public boolean getIfGoAndBack() {
        return ifGoAndBack;
    }

    public void setIfGoAndBack(boolean ifGoAndBack) {
        this.ifGoAndBack = ifGoAndBack;
    }
}
