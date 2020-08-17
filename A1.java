package com.demo;
import java.util.*;
interface Summation {
    public float add(float a, float b);
}

interface Subtraction {
    public float difference(float p,float q);
}

interface  Multiplication {
    public float product(float c, float d);
}

interface  Division{
    public float safeDivision(float j, float k );
}

class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter two numbers to perform addtion :: \n");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        Summation sm = (a, b) -> {
            return a+b;
        };
        System.out.println("\n Addition is : "+sm.add(x,y));
        System.out.println("\n Enter two numbers to perform subtraction :: \n");
        float m = sc.nextFloat();
        float n = sc.nextFloat();
        Subtraction sbt = (p,q)->{
            return p-q;
        };
        System.out.println("\nSubtraction is : "+sbt.difference(m,n));
        System.out.println("\n Enter two numbers to perform multiplication :: \n");
        float w = sc.nextFloat();
        float z = sc.nextFloat();
        Multiplication mp = (c,d)->{
            return c*d;
        };
        System.out.println("\n Multiplication is : "+mp.product(w,z));
        System.out.println("\n Enter two numbers to perform division :: \n");
        float g = sc.nextFloat();
        float h = sc.nextFloat();
        Division dv = (j,k)->{
            if(k==0) {
                System.out.println("\n Not a safe division \n");
            }
            return j/k;
        };
        System.out.println("\n Division is : "+dv.safeDivision(g,h));


    }
}
    