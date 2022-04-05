public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Zaky");
        employee.sayHello("budi");

        employee = new person("Budi");
        employee.sayHello("andi");
        employee = new waris("eko");
        employee.sayHello("dudi");

        sayHello(new Employee("Udin"));
        sayHello(new person("Andi"));
        sayHello(new waris("Dudung"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof waris) {
            waris Waris = (waris) employee;
            System.out.println("Hello VP " + Waris.name);
        } else if (employee instanceof person) {
            person Person = (person) employee;
            System.out.println("Hello Manager  " + Person.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
