package com.company;

abstract class shape{

  public abstract double area();
  public abstract double perimeter();

    public String toString(){
        return  "Area is     : "+ area()+"\npermeter is : "+perimeter();
    }
}
