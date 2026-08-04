package Day2;

class Employee {
    private int id;
    private String name;
    private double salary;

    // constructor to initialize id,name, salary
    public Employee(int id, String name, double salary){
        this.id= id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }   
    }
public class EmployeeNew {
    public static void main(String[] args) {
        Employee emp = new Employee(10,"Aaron",100000);

        System.out.println("Id " +emp.getId());
        System.out.println("Name " + emp.getName());
        System.out.println("Salary "+ emp.getSalary());
    }
}

