package Belajar.Package.Data;

public class Child extends Parent {
    public Child(String Name) {
        super(Name);
    }

    public void sayHello(String Name) {
        System.out.println("Hi " + Name + " My name is " + this.Name + " (Child)");
    }
}

