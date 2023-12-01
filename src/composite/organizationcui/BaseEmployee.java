/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.composite.organizationcui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class BaseEmployee implements IEmployee {
    private String name;
    private String dept;
    private int salary;
    private List<IEmployee> subordinates;

    public BaseEmployee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        this.subordinates = new ArrayList<>();
    }

    public void add(IEmployee e) {
        subordinates.add(e);
    }

    public void remove(IEmployee e) {
        subordinates.remove(e);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void giveBonus() {
        System.out.println("Bonus given to " + name);
    }

    @Override
    public String toString() {
        return "Employee: [Name: " + name + ", Dept: " + dept + ", Salary: " + salary + "]";
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

}
