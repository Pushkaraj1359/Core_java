// package hashSetPractice.p3;
// import java.util.HashSet;


// class Data {

// 	int x ;

// 	public Data(int x) {
// 		this.x = x;
// 	}

// 	public String toString() {
// 		return x + " ";
// 	}
	
// 	@Override
// 	public int hashCode() {
// 		return x%10;  
// 	}

//     public Data() {
//     }
	
// 	@Override
// 	public boolean equals(Object obj) {
// 		Data data=(Data)obj;
// 		if(this.x==data.x) return true;
// 		return false;
// 	}
// }
// public class App {
	
// 	public static void main(String[] args) {

// 		Data d1 = new Data(11);
// 		Data d2 = new Data(21);
// 		Data d3 = new Data(12);
// 		Data d4 = new Data(31);
// 		Data d5 = new Data(11);
		
// 		HashSet<Data> hs = new HashSet<Data>();
		
// 		hs.add(d1);
// 		hs.add(d2);
// 		hs.add(d3);
// 		hs.add(d4);
// 		hs.add(d5);
		
		
// 		System.out.println(hs);
// 		System.out.println("--------");
// 		System.out.println(d1.hashCode());
// 		System.out.println(d2.hashCode());
// 		System.out.println(d3.hashCode());
// 		System.out.println(d4.hashCode());
// 		System.out.println(d5.hashCode());
		
// 	}
// }



// /*
// ==================== HashSet with Custom hashCode (x % 10) ====================

// 🔹 What you changed in this code:

// @Override
// public int hashCode() {
//     return x % 10;
// 	}
	
// 	@Override
// 	public boolean equals(Object obj) {
// 		Data data = (Data) obj;
// 		return this.x == data.x;
// 		}
		
// 		--------------------------------------------------------------------------------

// 		🔹 Object Values:

// d1 → 11
// d2 → 21
// d3 → 12
// d4 → 31
// d5 → 11

// --------------------------------------------------------------------------------

// 🔹 hashCode Calculation (x % 10):

// 11 % 10 = 1
// 21 % 10 = 1
// 12 % 10 = 2
// 31 % 10 = 1
// 11 % 10 = 1

// So:

// d1 → 1
// d2 → 1
// d3 → 2
// d4 → 1
// d5 → 1

// --------------------------------------------------------------------------------

// 🔹 Important Concept: COLLISION

// Many objects have SAME hashCode:

// d1, d2, d4, d5 → all go to SAME bucket (bucket 1)

// This is called:
// 👉 Hash Collision

// --------------------------------------------------------------------------------

// 🔹 How HashSet Handles This:

// Step 1: Use hashCode() → decide bucket
// Step 2: Inside bucket → use equals() to compare

// --------------------------------------------------------------------------------

// 🔹 Internal Working:

// Bucket 1:
// → Data(11) [d1]
// → Data(21) [d2]
// → Data(31) [d4]

// Now inserting d5 (Data(11)):

// - hashCode same → goes to bucket 1
// - equals() check with d1 → TRUE

// So:
// ❌ d5 is NOT added (duplicate)

// --------------------------------------------------------------------------------

// 🔹 Final HashSet Data:

// [11, 21, 12, 31]

// (no duplicate 11)

// --------------------------------------------------------------------------------

// 🔹 Printed hashCodes:

// 1
// 1
// 2
// 1
// 1

// (All collisions clearly visible)

// --------------------------------------------------------------------------------

// 🔹 Key Learning:

// 1. Same hashCode DOES NOT mean duplicate
// 2. equals() decides actual equality
// 3. hashCode() only decides bucket

// --------------------------------------------------------------------------------

// 🔹 Golden Rule:

// hashCode() → grouping (bucket)
// equals()   → final comparison

// --------------------------------------------------------------------------------

// 🔹 Important Interview Point:

// Even if many objects have same hashCode,
// HashSet will still work correctly
// because equals() is used to confirm duplicates.

// --------------------------------------------------------------------------------

// 🔹 Final Conclusion:

// - You forced collisions using (x % 10)
// - HashSet handled it correctly
// - Duplicate removed because equals() is properly overridden

// ================================================================================

// 🔹Very important Line:
// “hashCode() puts objects in the same bucket, equals() decides if they are actually duplicates.”

// ================================================================================

// */

// // ==================== equals() Method Notes ====================
// //
// // 🔹 What is equals()?
// //
// // equals() is a method from Object class.
// // It is used to compare two objects.
// //
// // public boolean equals(Object obj)
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Default Behavior:
// //
// // equals() compares memory address (reference), NOT values.
// //
// // Example:
// //
// // Data d1 = new Data(11);
// // Data d2 = new Data(11);
// //
// // d1.equals(d2) → false  (different memory)
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Why override equals()?
// //
// // To compare objects based on VALUES instead of memory.
// //
// // Example:
// // We want → 11 == 11 → true
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Custom equals() Method:
// //
// // @Override
// // public boolean equals(Object obj) {
// //     if (this == obj) return true;
// //
// //     if (obj == null || getClass() != obj.getClass())
// //         return false;
// //
// //     Data data = (Data) obj;
// //     return this.x == data.x;
// // }
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Step-by-Step Working:
// //
// // 1. if (this == obj)
// //    → checks same object in memory
// //
// // 2. if (obj == null || class mismatch)
// //    → avoids NullPointerException and ClassCastException
// //
// // 3. type casting
// //    → Object → Data
// //
// // 4. compare values
// //    → this.x == data.x
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Why parameter is Object?
// //
// // Because equals() is defined in Object class.
// // It allows comparison with ANY object.
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Important Points:
// //
// // - equals() must be overridden for custom classes
// // - Used in HashSet, HashMap, etc.
// // - Works together with hashCode()
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Golden Rule:
// //
// // equals() → compares values
// // ==       → compares memory
// //
// // ----------------------------------------------------------------
// //
// // 🔹 Final Conclusion:
// //
// // By default, equals() compares memory,
// // but after overriding,
// // it compares object values.
// //
// // ================================================================