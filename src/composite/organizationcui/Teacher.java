/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.composite.organizationcui;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Teacher extends BaseEmployee{
    public Teacher(String name, String dept, int sal) {
        super(name, dept, sal);
    }

    @Override
    public void giveBonus() {
        double bonusPercentage = 0.05;
        int currentSalary = getSalary();
        int bonusAmount = (int) (currentSalary * bonusPercentage);

        setSalary(currentSalary + bonusAmount);

        System.out.println("Bonus of " + bonusAmount + " given to Teacher: " + getName());
    }
}
