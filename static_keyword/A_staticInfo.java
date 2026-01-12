class demo {

    // static block
    static {
        System.out.println("Static block executed");
    }

    // instance block
    {
        System.out.println("Instance block executed");
    }

    // constructor
    demo() {
        System.out.println("Constructor executed");
    }
}

public class A_staticInfo {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo();
    }
}


/* Static block executed
Instance block executed
Constructor executed
Instance block executed
Constructor executed   */
