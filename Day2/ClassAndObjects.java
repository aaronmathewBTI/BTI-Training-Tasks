package Day2;

//We have 2 classes ClassA and ClassAndObjects
class ClassA{
    String name;
    int age;
    ClassA(String n, int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name ="+name+", Age="+age);
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        ClassA class1 = new ClassA("Aaron", 22);
        // class1.name="Aaron";
        // class1.age = 22;
        class1.display();

        // ClassA class2= new ClassA();
        // class2.display();

    }

}
