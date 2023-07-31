package com.mycompany.prac03;
public class Prac03
{

    public static void main(String[] args)
    {
        Employee employee = new Employee("Dil",20,50000.0);
        
        // Set values using setters
        employee.setEmpName("Bogdan");
        employee.setAge(20);
        employee.setSalary(50000.0);
        
        
        // Get values using getters
        String empName = employee.getEmpName();
        int age = employee.getAge();
        double salary = employee.getSalary();
        
        // Print the values
        System.out.println("Employee EmpName: " + empName);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    
    }
}