package com.demo;
import java.util.*;
class Rectangle{

    public void display(int width, int height){
        System.out.println("\nFrom class Rectangle \nWidth is : "+width+" ; Height is : "+height);
    }
}
class RectangleArea extends Rectangle{
    public void read_input(int width, int height){
        System.out.println("\nWidth is : "+width+" ; Height is : "+height);
    }
    public void display(int width, int height){
        System.out.println("\nFrom the derived class RectangleArea \nArea is : "+width*height);
    }
}
class Main {

    public static void main(String[] args) {
        RectangleArea rA = new RectangleArea();
        Scanner sc = new Scanner(System.in);
        int p,q;
        p = sc.nextInt();
        q = sc.nextInt();
        rA.read_input(p,q);
        rA.display(p,q);
    }
}
