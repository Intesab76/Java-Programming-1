//package com.demo;
import  java.util.*;

class Employee{
    private int empId;
    private String empName , empDesignation , empLocation;
    private float empSalary;
    public Employee(int empId , String empName , String empDesignation , float empSalary , String empLocation){
        this.empId = empId;
        this.empName =  empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }
//    public void setEmpId(int empId){
//        this.empId = empId;
//    }
    public  int getEmpId(){
        return empId;
    }
//    public void setEmpName(String empName){
//        this.empName = empName;
//    }
    public String getEmpName(){
        return empName;
    }
//    public void setEmpDesignation(String  empDesignation){
//        this.empDesignation = empDesignation;
//    }
    public String getEmpDesignation(){
        return empDesignation;
    }
//    public void setEmpSalary(float empSalary){
//        this.empSalary = empSalary;
//    }
    public float getEmpSalary(){
        return  empSalary;
    }
//    public void setEmpLocation(String empLocation){
//        this.empLocation = empLocation;
//    }
    public String getEmpLocation(){
        return empLocation;
    }
    public String toString() {
        return getEmpId() +" "+ getEmpName()+" "+" "+getEmpDesignation()+" "+getEmpLocation()+" "+
                getEmpSalary();
    }
 }

class Call {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[10];

        for (int i = 0; i < 2; i++) {
            emp[i] = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat(), sc.next());
        }
//        for(int i=0;i<2;i++){
//            emp[i].setEmpId(sc.nextInt());
//            emp[i].setEmpName(sc.next());
//            emp[i].setEmpDesignation(sc.next());
//            emp[i].setEmpSalary(sc.nextFloat());
//            emp[i].setEmpLocation(sc.next());
//            System.out.println("\n-----------------------------------------------\n");
//        }
        //for (int i = 0; i < 2; i++) {
            //System.out.println(emp[i].getEmpId());
           // System.out.println(emp[i].getEmpName());
            // System.out.println(emp[i].getEmpDesignation());
            //if (emp[i].getEmpSalary() > 50000) {
            //    System.out.println(emp[i].getEmpSalary());
            //}// System.out.println(emp[i].getEmpLocation());
          //  System.out.println("\n-----------------------------------------------\n");
    //    }
    }
}






