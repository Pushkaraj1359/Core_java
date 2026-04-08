package hashSetPractice.p2;
import java.util.HashSet;

class Data{

    int x;

    public Data(int x){
        this.x=x;
    }

    public String toString(){
        return x+" ";
    }
}

public class App {
    public static void main(String[] args){

        Data d1=new Data(11);
        Data d2=new Data(21);
        Data d3=new Data(12);
        Data d4=new Data(31);
        Data d5=new Data(11);

        HashSet<Data> hs = new HashSet<Data>();

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);
        hs.add(d5);

        System.out.println(hs);

        System.out.println("--------");
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
		System.out.println(d5.hashCode());
    }
}

// output
// [11 , 31 , 12 , 11 , 21 ]



/*
==================== HashSet + hashCode() + equals() Complete Notes ====================

🔹 Problem:
You used HashSet to avoid duplicates,
but duplicate values (like 11) are still appearing.

---------------------------------------------------------------------------------------

🔹 Reason:
HashSet does NOT compare values directly.
It works using:
1. hashCode()
2. equals()

---------------------------------------------------------------------------------------

🔹 Your Class:

class Data {
    int x;
}

You did NOT override:
- hashCode()
- equals()

So Java uses default methods from Object class.

---------------------------------------------------------------------------------------

🔹 Default Behavior (IMPORTANT):

- hashCode() → based on memory address (different for each object)
- equals()   → compares object reference (memory), NOT values

---------------------------------------------------------------------------------------

🔹 Object Creation:

Data d1 = new Data(11);   // Address A1
Data d5 = new Data(11);   // Address A5

Important:
d1 and d5 have same value (11)
BUT different memory locations (A1 ≠ A5)

---------------------------------------------------------------------------------------

🔹 Heap Memory Diagram:

d1 ──► Data(x=11)   (A1)
d2 ──► Data(x=21)   (A2)
d3 ──► Data(x=12)   (A3)
d4 ──► Data(x=31)   (A4)
d5 ──► Data(x=11)   (A5)

---------------------------------------------------------------------------------------

🔹 What HashSet Sees:

Bucket1 → Data(11) [A1]
Bucket2 → Data(21) [A2]
Bucket3 → Data(12) [A3]
Bucket4 → Data(31) [A4]
Bucket5 → Data(11) [A5]

---------------------------------------------------------------------------------------

🔹 Why Duplicate is Stored:

d1.hashCode() ≠ d5.hashCode()
d1.equals(d5) → false

So HashSet thinks:
"These are different objects"

→ BOTH are added (duplicate allowed)

---------------------------------------------------------------------------------------

🔹 hashCode() Printing:

System.out.println(d1.hashCode());
System.out.println(d5.hashCode());

Output (example):
366712642
118352462

Note:
Values change every run,
but d1 and d5 hashCodes are DIFFERENT.

---------------------------------------------------------------------------------------

🔹 Key Concept:

HashSet removes duplicates ONLY when:
1. hashCode() is SAME
AND
2. equals() returns TRUE

---------------------------------------------------------------------------------------

🔹 Solution (Fix):

Override BOTH methods inside Data class:

public int hashCode() {
    return x;
}

public boolean equals(Object obj) {
    Data d = (Data) obj;
    return this.x == d.x;
}

---------------------------------------------------------------------------------------

🔹 After Fix:

d1.hashCode() == d5.hashCode()
d1.equals(d5) → true

---------------------------------------------------------------------------------------

🔹 Updated HashSet:

Bucket1 → Data(11)
Bucket2 → Data(21)
Bucket3 → Data(12)
Bucket4 → Data(31)

Second 11 is rejected

---------------------------------------------------------------------------------------

🔹 Final Summary:

Without override:
11(A1)  21  12  31  11(A5)  → Duplicate allowed

With override:
11  21  12  31  → Duplicate removed

---------------------------------------------------------------------------------------

🔹 Golden Rule (VERY IMPORTANT):

Same Value ≠ Same Object (by default)

Java checks memory, not values.

To compare values:
→ Override equals() and hashCode()

---------------------------------------------------------------------------------------

🔹 Final Conclusion:

HashSet works perfectly,
but for custom objects,
you MUST override hashCode() and equals()
to define what "duplicate" means.

=======================================================================================
*/

