package Belajar.Package.Aplication;

import Belajar.Package.Data.Child;
import Belajar.Package.Data.Parent;

public class ParentApp {
    public static void main(String[] args) {
        Parent parent = new Parent("Zaky");
        parent.sayHello("Budi");

        parent = new Child("Ayam");
        parent.sayHello("bebek");

    }
}
