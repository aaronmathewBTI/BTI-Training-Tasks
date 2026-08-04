package Day5;

import java.util.*;

class Employee {

    private int employeeId;
    private String employeeName;
    private String department;
    private String designation;
    private double salary;
    private int experience;
    private String status;

    public Employee(int employeeId, String employeeName, String department,
                    String designation, double salary, int experience, String status) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.experience = experience;
        this.status = status;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Employee ID      : " + employeeId +
                "\nEmployee Name    : " + employeeName +
                "\nDepartment       : " + department +
                "\nDesignation      : " + designation +
                "\nSalary           : " + salary +
                "\nExperience       : " + experience + " Years" +
                "\nStatus           : " + status;
    }
}

public class Activity01EmployeeManagementApp {

    static ArrayList<Employee> employees = new ArrayList<>();
    static LinkedList<String> activityLog = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Employee
    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        String desig = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Experience: ");
        int exp = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        Employee emp = new Employee(id, name, dept, desig, salary, exp, status);

        employees.add(emp);
        activityLog.add("[LOG] Employee " + id + " added.");

        System.out.println();
    }

    // Find Employee
    static Employee findEmployee(int id) {

        for (Employee e : employees) {
            if (e.getEmployeeId() == id)
                return e;
        }

        return null;
    }

    // Update Employee
    static void updateEmployee(int employeeId) {

        Employee e = findEmployee(employeeId);

        if (e == null) {
            System.out.println("Employee not found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter New Department: ");
        e.setDepartment(sc.nextLine());

        System.out.print("Enter New Salary: ");
        e.setSalary(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter New Designation: ");
        e.setDesignation(sc.nextLine());

        System.out.print("Enter New Experience: ");
        e.setExperience(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter New Status: ");
        e.setStatus(sc.nextLine());

        activityLog.add("[LOG] Employee " + employeeId + " updated.");

        System.out.println("\n===== EMPLOYEE UPDATED SUCCESSFULLY =====\n");
        System.out.println(e);
        System.out.println("------------------------------------------------");
    }

    // Remove Employee
    static void removeEmployee(int employeeId) {

        // Employee e = findEmployee(employeeId);

        // if (e == null) {
        //     System.out.println("Employee not found.");
        //     return;
        // }

        // employees.remove(e);

        activityLog.add("[LOG] Employee " + employeeId + " removed.");

        System.out.println("\n===== EMPLOYEE REMOVED SUCCESSFULLY =====\n");
        System.out.println("Removed Employee ID : " + employeeId);
        System.out.println("------------------------------------------------");
    }

    // Search Employee
    static void searchEmployee(String keyword) {

        keyword = keyword.toLowerCase();

        boolean found = false;

        System.out.println("\n===== SEARCH RESULTS =====\n");

        for (Employee e : employees) {

            if (String.valueOf(e.getEmployeeId()).contains(keyword)
                    || e.getEmployeeName().toLowerCase().contains(keyword)
                    || e.getDepartment().toLowerCase().contains(keyword)
                    || e.getDesignation().toLowerCase().contains(keyword)) {

                System.out.println(e);
                System.out.println();
                found = true;
            }
        }

        if (!found)
            System.out.println("No employee found.");

        System.out.println("------------------------------------------------");
    }
        // Transfer Department
    static void transferDepartment(int employeeId, String newDepartment) {

        Employee e = findEmployee(employeeId);

        if (e == null) {
            System.out.println("Employee not found.");
            return;
        }

        e.setDepartment(newDepartment);

        activityLog.add("[LOG] Employee " + employeeId +
                " transferred to " + newDepartment + ".");

        System.out.println("\n===== EMPLOYEE TRANSFERRED SUCCESSFULLY =====\n");
        System.out.println("Employee " + employeeId +
                " transferred to " + newDepartment + " department.");
        System.out.println("------------------------------------------------");
    }

    // Display All Employees
    static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        System.out.println("\n===== ALL EMPLOYEES =====\n");

        for (Employee e : employees) {
            System.out.println(e);
            System.out.println();
        }

        System.out.println("------------------------------------------------");
    }

    // Display Active Employees
    static void displayActiveEmployees() {

        boolean found = false;

        System.out.println("\n===== ACTIVE EMPLOYEES =====\n");

        for (Employee e : employees) {

            if (e.getStatus().equalsIgnoreCase("Active")) {

                System.out.println(e);
                System.out.println();
                found = true;
            }
        }

        if (!found)
            System.out.println("No active employees available.");

        System.out.println("------------------------------------------------");
    }

    // Display Inactive Employees
    static void displayInactiveEmployees() {

        boolean found = false;

        System.out.println("\n===== INACTIVE EMPLOYEES =====\n");

        for (Employee e : employees) {

            if (e.getStatus().equalsIgnoreCase("Inactive")) {

                System.out.println(e);
                System.out.println();
                found = true;
            }
        }

        if (!found)
            System.out.println("No inactive employees available.");

        System.out.println("------------------------------------------------");
    }

    // Sort Employees
    static void sortEmployees(int choice) {

        switch (choice) {

            case 1:
                employees.sort(Comparator.comparingDouble(Employee::getSalary));
                System.out.println("\n===== EMPLOYEES SORTED BY SALARY =====");
                break;

            case 2:
                employees.sort(Comparator.comparingInt(Employee::getExperience));
                System.out.println("\n===== EMPLOYEES SORTED BY EXPERIENCE =====");
                break;

            case 3:
                employees.sort(Comparator.comparing(Employee::getEmployeeName));
                System.out.println("\n===== EMPLOYEES SORTED BY NAME =====");
                break;

            case 4:
                employees.sort(Comparator.comparing(Employee::getDepartment));
                System.out.println("\n===== EMPLOYEES SORTED BY DEPARTMENT =====");
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        int i = 1;

        for (Employee e : employees) {

            System.out.println("\n" + i++ + ".");
            System.out.println(e);
        }

        System.out.println("------------------------------------------------");
    }

    // Department-wise Report
    static void departmentReport() {

        HashMap<String, ArrayList<Employee>> map = new HashMap<>();

        for (Employee e : employees) {

            map.putIfAbsent(e.getDepartment(), new ArrayList<>());
            map.get(e.getDepartment()).add(e);
        }

        for (String dept : map.keySet()) {

            ArrayList<Employee> list = map.get(dept);

            double total = 0;
            double max = 0;

            for (Employee e : list) {

                total += e.getSalary();

                if (e.getSalary() > max)
                    max = e.getSalary();
            }

            System.out.println("\n===== " + dept.toUpperCase() + " DEPARTMENT =====");
            System.out.println("Total Employees : " + list.size());
            System.out.println("Average Salary  : " + (total / list.size()));
            System.out.println("Highest Salary  : " + max);
        }

        System.out.println("------------------------------------------------");
    }
        // Salary Statistics
    static void salaryStatistics() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        double highest = employees.get(0).getSalary();
        double lowest = employees.get(0).getSalary();
        double total = 0;

        for (Employee e : employees) {

            total += e.getSalary();

            if (e.getSalary() > highest)
                highest = e.getSalary();

            if (e.getSalary() < lowest)
                lowest = e.getSalary();
        }

        System.out.println("\n===== SALARY STATISTICS =====\n");
        System.out.println("Highest Salary       : " + highest);
        System.out.println("Lowest Salary        : " + lowest);
        System.out.println("Average Salary       : " + (total / employees.size()));
        System.out.println("Total Salary Expense : " + total);
        System.out.println("------------------------------------------------");
    }

    // Display Activity Log
    static void displayActivityLog() {

        System.out.println("\n===== ACTIVITY LOG =====\n");

        if (activityLog.isEmpty()) {
            System.out.println("No activities available.");
        } else {
            for (String log : activityLog) {
                System.out.println(log);
            }
        }

        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {

        System.out.print("Enter number of employees to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            addEmployee();
        }

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Update Employee");
            System.out.println("2. Transfer Department");
            System.out.println("3. Search Employee");
            System.out.println("4. Sort Employees");
            System.out.println("5. Remove Employee");
            System.out.println("6. Display Active Employees");
            System.out.println("7. Display Inactive Employees");
            System.out.println("8. Department-wise Report");
            System.out.println("9. Salary Statistics");
            System.out.println("10. Display Activity Log");
            System.out.println("11. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID to update: ");
                    updateEmployee(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Employee ID to transfer department: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Department: ");
                    transferDepartment(id, sc.nextLine());
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter keyword to search employee: ");
                    searchEmployee(sc.nextLine());
                    break;

                case 4:
                    System.out.println("Choose Sorting Option:");
                    System.out.println("1. Sort by Salary");
                    System.out.println("2. Sort by Experience");
                    System.out.println("3. Sort by Employee Name");
                    System.out.println("4. Sort by Department");
                    System.out.print("Enter choice: ");
                    sortEmployees(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Employee ID to remove: ");
                    removeEmployee(sc.nextInt());
                    break;

                case 6:
                    displayActiveEmployees();
                    break;

                case 7:
                    displayInactiveEmployees();
                    break;

                case 8:
                    departmentReport();
                    break;

                case 9:
                    salaryStatistics();
                    break;

                case 10:
                    displayActivityLog();
                    break;

                case 11:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}