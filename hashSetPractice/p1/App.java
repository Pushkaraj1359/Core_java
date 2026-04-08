package hashSetPractice.p1;
import java.util.HashSet;

public class App {
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(11);
        numbers.add(22);
        numbers.add(11);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);

        System.out.println(numbers);
    }
}

// outPut :- [33, 22, 55, 11, 44]

/*
------------------- HashSet & hashCode() Notes -------------------

HashSet:
HashSet is a part of Java Collection Framework.
It stores only unique elements (no duplicates allowed).
It does not maintain insertion order.

hashCode():
hashCode() is a method of Object class.
It returns an integer value that represents the object.

public int hashCode()
-> Returns a hash code value for the object.

Why hashCode() is used in HashSet:  
HashSet uses hashCode() to store elements efficiently.
It helps in identifying duplicate elements.

How duplicate is prevented:
1. When an element is added, hashCode() is generated.
2. HashSet checks if same hashCode already exists.
3. If yes, equals() method is used to compare values.
4. If both are same, duplicate element is not added.

Example:
hs.add(11);
hs.add(11); // duplicate, so ignored

Internal working:
HashSet uses hashing technique and stores data in buckets.
hashCode() decides the bucket location.

Key Points:
- No duplicate elements allowed
- Uses hashCode() internally
- Order is not maintained
- Allows only one null value

Conclusion:
hashCode() plays an important role in HashSet to manage data
efficiently and avoid duplicate elements.
---------------------------------------------------------------

 */
