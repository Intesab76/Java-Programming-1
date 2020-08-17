package com.demo;
import java.util.*;

public class Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> l = Arrays.asList(
                new Employee(100, "Rohan", "Developer", 75000, "Hyderabad"),
                new Employee(200, "Rohini", "DataScienceTrainee", 60000, "Delhi"),
                new Employee(250, "Shweta", "GeneralManager", 65000, "Gurgaon"),
                new Employee(300, "Ajay", "SoftwareAnalyst", 68000, "MadhyaPradesh"),
                new Employee(350, "Shrishti", "NetworkEngineer", 40000, "Rajasthan"),
                new Employee(400, "Abhishek", "ContentWriterTrainee", 45000, "Manipur"),
                new Employee(450, "Vaishali", "MachineLearningEngineer", 76000, "Bangalore"),
                new Employee(500, "Suraj", "SoftwareTestingAnalyst", 56000, "Surat"),
                new Employee(550, "Niketa", "Marketer", 38000, "Faridabad"),
                new Employee(600, "Sameer", "Journalist", 51000, "Mumbai"));
        l.stream().forEach(ls-> System.out.println(ls.getEmpName()));
        System.out.println("\n-----------------------------------------");
        l.stream().filter(ls->ls.getEmpSalary()>50000).forEach(ls-> System.out.println(ls.getEmpSalary()));
        System.out.println("\n-----------------------------------------");
        l.stream().filter(lc->lc.getEmpLocation().startsWith("M")).forEach(lc-> System.out.println(lc.getEmpLocation()));
        System.out.println("\n-----------------------------------------");
        l.stream().filter(ld->ld.getEmpDesignation().endsWith("e")).forEach(ld-> System.out.println(ld.getEmpDesignation()));
    }
}
