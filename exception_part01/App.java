package exception_part01;

class App {

    public static void f1() {
        System.out.println("IN F1");
        f2();
        System.out.println("END F1");
    }

    public static void f2() {
        System.out.println("IN F2");
        f3();
        System.out.println("END F2");
    }

    public static void f3() {
        System.out.println("IN F3");
        int x = 11;
        int y = 0;

        try {
            int res = x / y;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("END F3");
    }


    // public static void f3() {
    //     System.out.println("IN F3");
    //     int x = 11;
    //     int y = 0;
    //     int res = x / y;   // ArithmeticException occurs here
    //     System.out.println(res);
    //     System.out.println("END F3");
    // }

    public static void main(String[] args) {
        System.out.println("IN Main");
        f1();
        System.out.println("END Main");
    }
}

// Yes, this program is an example of exception propagation. 
// The ArithmeticException occurs in f3() and since it is not handled there, 
// it propagates to f2(), then f1(), and finally to main(). As no method handles it, 
// the program terminates abnormally.



// What Happens?

// Exception occurs in f3()
// f3() does NOT handle it (no try-catch)
// JVM sends exception to f2()
// f2() does NOT handleJVM sends exception to f1()
// f1() does NOT handle it
// JVM sends exception to main()
// main() does NOT handle it
// Program terminates 

// What is Exception Propagation

// Exception propagation is the process of forwarding an exception from one method to its calling method until it is handled.
// note :- 
//         Exception propagation happens only for Unchecked Exceptions (RuntimeException) automatically.
//         Checked exceptions must be handled or declared using throws.
//         Propagation stops immediately when exception is handled using try-catch



