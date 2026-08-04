package Day3;

import java.util.jar.Attributes.Name;

class Person{
    private String name;
    private String gender;
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("Person(String, String)");
    }
    public Person(){
        System.out.println("Person()");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

public void Display(){
    System.out.println("Person class details : "+getName()+" ,"+ getGender());
}
}

class Student extends Person{
    private int rollNo;
    private int marks;
    public Student(String name, String gender, int rollNo, int marks) {
        super(name, gender);
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
@Override
public void Display(){
    System.out.println("Student class details : "+getName()+" ,"+ getGender()+","+getMarks()+", "+getRollNo());
}
}

class Employee extends Person{
    private int id;
    private double salary;
    public Employee() {
        
    }
    public Employee(String name, String gender, int id, double salary) {
        super(name, gender);
        this.id = id;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

@Override
public void Display(){
    System.out.println("Employee details: "+getName()+" ,"+getGender()+" ," +getSalary()+" ," +getId());
}
    
}

public class TestInheritance {

    public static void main(String[] args) {
        Student student1= new Student("Aaron", "Male", 1, 100);
        Employee employee1= new Employee("Sujan", "Male", 10, 1000000);
        employee1.Display();
        student1.Display();

        // System.out.println("Student Name: = "+student1.getName()+", Gender: = "+student1.getGender()+", RollNo: = "+student1.getRollNo()+", Marks: = "+student1.getMarks());
    }
}
