package com.demo2;
import  java.util.*;

class Triangle {

    double areaOfTriangle(double a , double b , double c){
        double semi = (a+b+c)/2;
        double final_val = semi * (semi - a) * (semi - b) * (semi - c);
        return (double)Math.sqrt(final_val);
    }
}
class CallMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle tr = new Triangle();
        System.out.println("\nArea of the triangle is ::  "+
                tr.areaOfTriangle(scanner.nextDouble() , scanner.nextDouble() , scanner.nextDouble()));

    }
}
