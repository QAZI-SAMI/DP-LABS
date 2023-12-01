/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.composite.organizationcui;

import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class EmployeeController {
    private IEmployee rootEmployee;

    public EmployeeController(IEmployee rootEmployee) {
        this.rootEmployee = rootEmployee;
    }
    public String generateOrganogram() {
        StringBuilder organogram = new StringBuilder();
        generateOrganogramRecursive(rootEmployee, organogram, 0);
        return organogram.toString();
    }
    private void generateOrganogramRecursive(IEmployee employee, StringBuilder organogram, int depth) {
        // Indent based on depth for a hierarchical view
        for (int i = 0; i < depth; i++) {
            organogram.append("  ");
        }

        // Append employee information
        organogram.append("- ").append(employee.toString()).append("\n");

        // Recursively generate organogram for subordinates
        List<IEmployee> subordinates = ((BaseEmployee) employee).getSubordinates();
        for (IEmployee subordinate : subordinates) {
            generateOrganogramRecursive(subordinate, organogram, depth + 1);
        }
    }

//    public String generateOrganogram() {
//        // Implementation to generate and return the organogram
//        // This can be a complex logic based on the hierarchy and relationships
//        return "Organogram Generated";
//    }
}
