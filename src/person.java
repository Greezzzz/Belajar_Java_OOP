class person extends Employee {
    String address;
    final String country = "Indonesia";

    //  contructor untuk memaksa orang men set data name dan address atau data apapun jika menggunakan class tersebut
    person(String name, String address) {
        super(name);
        this.address = address; //mengatasi shadowing dengan this
    }

    person(String paramName) {
        this(paramName, null); // ini memanggil constructor pertama tetapi parameter kedua null
    }

    person() {
        this(null); //ini memanggil constructor yang kedua, tetapi diisi dengan null
    }

    //  method
    void sayHello(String name) {
        System.out.println("Hello " + name + " My name is Manager " + this.name); //menggunakan this juga
    }
}

// pewarisan atau inheritance
class waris extends person{

    waris(String name) {
        super(name);
    }
    void sayHello(String name) { // mehtod overriding
        System.out.println("Hello " + name + " My name is VP " + this.name);
    }
}
