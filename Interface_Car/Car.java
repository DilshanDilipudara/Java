package com.company;

class Car implements steerable{

    int regNo;

    public Car(int regNo){
        this.regNo = regNo;
    }

    public  void turnLeft(){

        System.out.println("Vehicle Number is "+regNo+" Turn_Rihgt");
    }
    public void turnRight(){
        System.out.println("Vehicle Number is "+regNo+" Turn Right");
    }
}