public class mainclass {
    public static void main(String[] args) {
        var person1 = new person("Zaky", "Jakarta");

         System.out.println(person1.name);
        System.out.println(person1.address);
        person1.sayHello("Radith");

        person person2 = new person("Udin");
        System.out.println(person2.name);
        System.out.println(person2.address="Bali");
        System.out.println(person2.country);
        person person3;
        person3 = new waris("zaky");
        person3.name = "Syams";
        person3.sayHello("Udin");
        person person4 = new person("Syams");
        person4.sayHello("Bagus");

    }
}
