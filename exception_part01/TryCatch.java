package exception_part01;

public class TryCatch {
    
}


/* 


try {
    // risky code
} catch(ExceptionType e) {
    // handling code
}


example : -

    public class Demo {
        public static void main(String[] args) {

            try {
                int x = 10 / 0;   // risky code
            } 
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            System.out.println("Program continues...");
        }

    }

    output :-
    Cannot divide by zero
    Program continues...




    Nested try-catch (try inside try)

    try {

        try {
            int x = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Inner catch handled");
        }
    } 
    catch (Exception e) {
        System.out.println("Outer catch handled");
    }

output :- 
    Inner catch handled

👉 First inner try runs
👉 If error happens → inner catch handles
👉 Outer catch runs only if inner does NOT handle






try inside catch


public class Demo3 {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        } 
        catch (ArithmeticException e) {

            System.out.println("First error handled");

            try {
                String s = null;
                System.out.println(s.length());
            } 
            catch (NullPointerException ex) {
                System.out.println("Second error handled");
            }
        }
    }
}

Output:
First error handled
Second error handled




Multiple catch blocks


public class Demo4 {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[10] = 50;
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        } 
        catch (Exception e) {
            System.out.println("Some other error");
        }
    }
}

Output:
    Array error

👉 Correct catch block executed




try–catch–finally

public class Demo5 {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Error occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

Output:
Error occurred
Finally block executed

👉 Finally always runs



Case	                            Output Behavior
Basic try	                        Catch handles error
Nested try	                        Inner catch handles first
Try inside catch	                Multiple errors handled
Multiple catch	                    Matching catch runs
Finally	Always executes







What is Generic Catch?

A Generic Catch means catching a general exception instead of specific exceptions.

In Java, the most common generic catch is:

catch (Exception e)

Because Exception is the parent class of most exceptions.

🔹 Why It Is Called Generic?

Because it can catch:

ArithmeticException

NullPointerException

NumberFormatException

IOException

and many other exceptions

All these are children of Exception.

🔹 Example of Generic Catch
class App {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;   // ArithmeticException
        } 
        catch (Exception e) {
            System.out.println("Some error occurred");
        }

        System.out.println("Program continues...");
    }
}
Output:
Some error occurred
Program continues...

Here, we did not write catch(ArithmeticException e)
Still it caught the exception because Exception is parent class.

🔹 Specific Catch vs Generic Catch

Specific Catch:

catch (ArithmeticException e)

Generic Catch:

catch (Exception e)

Specific catch handles only one type.
Generic catch handles all exception types.

🔹 Important Rule (Very Important for Interview)

If you use multiple catch blocks:

Specific exception must come before generic exception.

Correct:

try {
    int x = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
}
catch (Exception e) {
    System.out.println("General Error");
}

Wrong:

catch (Exception e)
catch (ArithmeticException e)   // ❌ Compile-time error

Because generic already covers everything.

🎯 Interview Answer (Short and Strong)

“Generic catch is a catch block that catches all types of exceptions using the parent class Exception. It is useful when we want to handle multiple exceptions in a common way.”

🔥 Pro Tip

In real projects:

Use specific catch blocks for better error handling.
Use generic catch only when common handling is needed.

*/
