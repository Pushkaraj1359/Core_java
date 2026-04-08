

// Note :  linkedHasSet is used to we can contain --->  1)  unique elements.
//                                                      2)  maintain sertain order


package set.linkedHasSet;

import java.util.LinkedHashSet;

public class Demo01 {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();


        name.add("Pushkaraj");
        name.add("Pushkaraj");
        name.add("jay");
        name.add("vaibhav");
        name.add("balaji");
        name.add("Ajay");
        name.add("omkar");
        name.add("deepak");


        System.out.println("linkedHasSet elements :"+name);
        System.out.println(name.contains("Pushkaraj"));   // true
    }
}



// output 
// linkedHasSet elements :[Pushkaraj, jay, vaibhav, balaji, Ajay, omkar, deepak]

// see the Output :   1) unique contain 2) duplicate remove 3) insertion order (sequence) is maintain
                    