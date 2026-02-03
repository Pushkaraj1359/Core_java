package access_modifires;



public class A_public {
    public static void main(String[] args) {
        

// Same Class
// Accessing a member inside the same class where it is defined
        // class Details {
        //     void showDetails() {
        //         System.out.println("Hello");
        //     }

        //     void test() {
        //         showDetails(); // same class
        //     }
        // }



// Same Package
// Accessing from another class in the same package
    // package mypack;

    // class A {
    //     void msg() {}
    // }

    // class B {
    //     public static void main(String[] args) {
    //         A obj = new A();
    //         obj.msg(); // same package
    //     }
    // }


// Subclass
// Accessing from a child class (using inheritance)

    // class Parent {
    //     protected void show() {}
    // }

    // class Child extends Parent {
    //     void test() {
    //         show(); // subclass
    //     }
    // }



// Other Package
// Accessing from a class in a different package

    // package pack1;
    // public class A {
    //     public void msg() {}
    // }

    // package pack2;
    // import pack1.A;

    // class B {
    //     public static void main(String[] args) {
    //         A obj = new A();
    //         obj.msg(); // other package
    //     }
    // }

    }
}
