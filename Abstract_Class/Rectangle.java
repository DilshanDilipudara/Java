package com.company;

public class Rectangle extends shape{

    private  double hight;
    private  double wide;

    public Rectangle(double hight,double wide){

        this.hight = hight;
        this.wide = wide;
    }

    public double area(){
        double ar = hight*wide;
        return  ar;
    }
    public double perimeter(){
        return 2*(hight+wide);
    }


}
