package com.company;

public class Circle extends shape {

   private double radius;

   Circle(double radius){
       this.radius = radius;
   }
   public double  area(){
       return Math.PI*radius*radius;
   }
   public double perimeter(){
       return 2*Math.PI*radius;
   }
}
