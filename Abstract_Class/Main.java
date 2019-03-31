package com.company;

public class Main {

    public static void main(String[] args) {

        shape vec[] = {new Rectangle(2,3),new Circle(3)};

        for(int i=0;i<vec.length;i++){
            System.out.println("\n"+vec[i].toString());
        }


    }
}
