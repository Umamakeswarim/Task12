package task12;

import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee IDs and names to the TreeMap
        employeeMap.put(101, "Gokul");
        employeeMap.put(102, "Mani");
        employeeMap.put(103, "Ria");
        employeeMap.put(104, "Uma");

        // Print out the names of all employees in alphabetical order
        System.out.println("Employees in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}
