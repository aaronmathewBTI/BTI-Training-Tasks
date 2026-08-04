package Day3;

interface Vehicle {
    void wheels();
    void mileage();
}

abstract class Bike implements Vehicle {
    public void wheels(){
        System.out.println("Bike: 2 wheels");
    }
}

// abstract class can have constructors
// but you can't create object of abstract class
class BMWBike1 extends Bike{
    public void mileage(){
        System.out.println("BMWBike 1 gives 30KMPL mileage");
    }
}
class BMWBike2 extends Bike {
    public void mileage(){
        System.out.println("BMWBike 2 gives 28KMPL mileage");
    }
}
public class TestAbstraction2 {
    public static void main(String[] args) {
        BMWBike1 bike1 = new BMWBike1();
        BMWBike2 bike2 = new BMWBike2();
        printDetails(bike1);
        printDetails(bike2);
    }
    public static void printDetails(Vehicle v) {
        v.wheels(); //runtime polymorphism
        v.mileage(); //runtime polymorphism
        System.out.println("***********");
    }

}
