package Belajar.Package.Data;

public class Parent {
    public String Name;
    public String Address;

    public Parent(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }

    public Parent(String Name) {
        this(Name, null);
    }

    public Parent() {
        this(null);
    }

    public void sayHello(String Name) {
        System.out.println("Hi " + Name + " My name is " + this.Name + " (Parent)");
    }
}
