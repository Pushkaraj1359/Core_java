import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public  class Example03{
	public static void main(String[] args) {
		
		// Generic Collection
		//Collection<Integer>numbers=new ArrayList<Integer>();
		//List<Integer>numbers=new ArrayList<Integer>();

		ArrayList<Integer>numbers=new ArrayList<Integer>();  // 10 
		numbers.add(11);
		numbers.add(11);
		numbers.add(44);
		numbers.add(33);
		numbers.add(22);

		// duplicates Object are allow
		// insertion order maintain

		// numbers.contains(new Integer(44))
		System.out.println("contains  "+numbers.contains(44));

		// public boolean contains(E e){  E e//Integer i

		//}

		//System.out.println("remove"+numbers.remove(44));
		System.out.println("remove"+numbers.remove(new Integer(44)));
		System.out.println(numbers);

		//int A[]={11,22,33,44,55};
		// numbers.add(A[i])
	}
}


// remove(3)			0		--------> remove element at index 3
// remove(Integer.valueOf(3))	--------> remove value 3


// numbers.remove(new Integer(44));    
// what happend 
// That object is passed to remove(Object o)
// ArrayList removes value 44 
// new Integer(44) creates a new Integer object



// numbers.remove(Integer.valueOf(44));

// What happens
// Integer.valueOf(44) returns an Integer object
// Passed to remove(Object o)
// ArrayList removes value 44
// ✅ This is the recommended modern way.


