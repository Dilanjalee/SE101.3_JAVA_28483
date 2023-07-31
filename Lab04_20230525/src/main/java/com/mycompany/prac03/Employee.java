package com.mycompany.prac03;
public class Employee
{
    private String empName;
    private int age;
    private double salary;
    
    // Constructor
    public Employee(String N, int A, double S)
    {
        this.empName = N;
        this.age = A;
        this.salary = S;
    }
    
    //Getter method to Name
    public String getEmpName()
    {
        return empName;
    }
    //Setter method to Name
    public void setEmpName(String N)
    {
        empName = N;
    }
    
    ////Getter method to Age
    public int getAge()
    {
        return age;
    }
    //Setter method to Age
    public void setAge(int A)
    {
        age = A;
    }
    
    //Getter method to Salary
    public double getSalary()
    {
        return salary;
    }
    ////Setter method to Salary
    public void setSalary(double S)
    {
        salary = S;
    }
    
    
}
