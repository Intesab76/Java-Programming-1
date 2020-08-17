package com.demo2;
import java.util.*;
class Employee{
    String name;
    int yearOfJoining;
    String address;

    public Employee(String name , int yearOfJoining , String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

//    public void getName(String name){
//        this.name = name;
//    }

   public String showName(){
        return name;
    }

//    void getYearOfJoining(int yearOfJoining){
//        this.yearOfJoining = yearOfJoining;
//    }

    int showYearOfJoining(){
        return yearOfJoining;
    }

//    void getAddress(String address){
//        this.address = address;
//    }

    String showAddress(){
        return address;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("Robert" , 1994 ,  "64C- WallStreet");
        emp[1] = new Employee("Sam" , 2000 , "68D- WallStreet");
        emp[2] = new Employee("John" , 1999 ,"26B- WallStreet");
        System.out.println("Name\t\tYear of joining\t    Address");

        System.out.println(emp[0].showName()+"\t\t"+emp[0].showYearOfJoining()+"\t\t\t\t"+emp[0].showAddress());
        System.out.println(emp[1].showName()+"\t\t\t"+emp[1].showYearOfJoining()+"\t\t\t\t"+emp[1].showAddress());
        System.out.println(emp[2].showName()+"\t\t"+emp[2].showYearOfJoining()+"\t\t\t\t"+emp[2].showAddress());
    }
}
