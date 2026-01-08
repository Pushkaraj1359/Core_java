// first program code for static keyword
package static_keyword;

// public class StaticWithLocal {
//     static int a = 10;
//     void m1(){
//         static int b = 20;         // static cant used as local varible...
//     }
// }




// ------------------->>>>>>>>>>>------------------------->>>>>>>>>>>>>>>>----------------->>>>>>>>>>>>>>>>>>>>

// class Test {
//     static int a = 10;
// }
// class demo{
//     public static void main(String[] args){
//         System.out.println(Test.a);    // static variable access by using className.varibleName like Test.a
//     }
// }

// ------------------->>>>>>>>>>>------------------------->>>>>>>>>>>>>>>>----------------->>>>>>>>>>>>>>>>>>>>
// if the int a = 10 ; then access by creating object 
// ------------------->>>>>>>>>>>------------------------->>>>>>>>>>>>>>>>----------------->>>>>>>>>>>>>>>>>>>>







// ------------------->>>>>>>>>>>------------------------->>>>>>>>>>>>>>>>----------------->>>>>>>>>>>>>>>>>>>>
// Q1) why static varible is create 
// ANS ---->  STATIC VARIABLE ARE USED FOR MEMORY MANAGEMENT.
//  -----> static varible space occup in class area , method  area, metaspace
//  ----->  object ares allocate in heap area.

// EXAMPLE

// class Employee{
//     int empId;
//     String empName;
//     static String companyName="the craze mood";    // make this variable atatic 

//     Employee(int empId, String empName) {   // remove companyName parameter from method
//         this.empId = empId;
//         this.empName=empName;
//        // remove  this.companyName=companyName;
//     }

    

//     void display(){
//         System.out.println(empId + " " + empName + " " + companyName);
//     }

// }

// public class StaticWithLocal{
//     public static void main(String[] args) {

//         Employee e1=new Employee(1, "karan");
//         e1.display();

//         Employee e2=new Employee(2, "arjun");
//         e2.display();
//     }
// }


// the static variable gets memory only once in the class area at the time of class loading..


// ------------------->>>>>>>>>>>------------------------->>>>>>>>>>>>>>>>----------------->>>>>>>>>>>>>>>>>>>>
// ------------------->>>>>>>>>>>------------------------->>>>>>>>>>>>>>>>----------------->>>>>>>>>>>>>>>>>>>>


