/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.composite.organizationcui;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Main {
    public static void main(String[] args) {
        // Creating instances of employees
        IEmployee director = new Director("John", "IT", 50000);
        IEmployee hod = new HeadOfDepartment("Alice", "Engineering", 40000);
        IEmployee teacher = new Teacher("Bob", "Math", 30000);
        IEmployee doo = new DOO("Charlie", "Operations", 45000);

        // Adding subordinates
        ((BaseEmployee) director).add(hod);
        ((BaseEmployee) hod).add(teacher);
        ((BaseEmployee) hod).add(doo);

        // Creating EmployeeController
        EmployeeController employeeController = new EmployeeController(director);

        // Generating Organogram
        String organogram = employeeController.generateOrganogram();
        System.out.println("Organogram: \n"+organogram);

        // Giving bonuses to employees
        director.giveBonus();
        for (IEmployee headEmployee : ((BaseEmployee) director).getSubordinates()) {
            headEmployee.giveBonus();

            for (IEmployee employee : ((BaseEmployee) headEmployee).getSubordinates()) {
                employee.giveBonus();
            }
        }
    }
}
