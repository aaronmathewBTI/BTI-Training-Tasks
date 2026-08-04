package Day3;

interface RegularUser{
    void book();
}
interface AdminUser {
    void book(int limit);
    void modifyName();
}

//Developer - 3 - different machine - implements both the interface
// if a class implements an interface it must override all the methods
class TicketAppV1 implements RegularUser, AdminUser{
    public void book(){
        System.out.println("you can book 12 tickets at max in a month");
    }
    public void book(int limit){
        System.out.println("you can book unlimited tickets in a month");
    }
    public void modifyName(){
        System.out.println("you can modify passenger name");
    }
}

public class TestAbstraction {
    // Developers who are writing the client code - regular user
    public static void processTaskByUser(RegularUser user) {
        user.book();
    }

    // Developers who are writing client code - admin user
    public static void processTaskByAdmin(AdminUser user) {
        user.book(9999); //limit doesn't matter here it is just to differentiate book method from user
        user.modifyName();
    }
    // Developer who creates the object and passes them when different user logs in
    public static void main(String[] args) {
        TicketAppV1 appV1 = new TicketAppV1();
        // developer passing this object for user
        processTaskByUser(appV1);
        System.out.println("____________________________");
        // developer passing same object for admin
        processTaskByAdmin(appV1);
    }

}
