package Day3;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void Displayinfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
}

class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        this.count = 0;
    }
//Add employees
    public void addEmployee(int id, String name, double salary){
        if(count < employees.length){
            employees[count] = new Employee(id, name, salary);
            count++;
        }else{
            System.out.println("Employee storage is full!");
        }
    }
    // Display all employees
    public void displayAllEmployees(){
        if (count == 0){
            System.out.println("No employees found.");
            return;
        }

        for(int i=0; i<count;i++){
            employees[i].Displayinfo();
        }
    }

    // Get employee count
    public int getEmployeeCount(){
        return count;
    }
}


public class ActivityDay3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter max number of employees");
        int capacity = sc.nextInt();
        sc.nextLine();

        EmployeeManager manager = new EmployeeManager(capacity);

        // Input employee details
        for (int i=0; i < capacity; i++){
            System.out.println("\nEnter details for Employee" + (i+1));

            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Name : ");
            String name = sc.nextLine();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            manager.addEmployee(id, name, salary);
        }

        // Display all employees
        System.out.println("Employee Records ______");
        manager.displayAllEmployees();

        System.out.println("Total Employees: "+ manager.getEmployeeCount());

        sc.close();

    }

}
