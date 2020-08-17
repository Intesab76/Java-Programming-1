package com.demo;
import java.util.*;

class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}
class Main{
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
        System.out.println("\n--------------------------------------");
        System.out.println("\nEnter the radius of the circle :: \n");
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle(sc.nextDouble());
        System.out.println(ob.getRadius());
        System.out.println(ob.getArea());


    }
}
