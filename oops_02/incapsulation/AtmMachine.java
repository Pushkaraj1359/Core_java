/*Problem 8: 
ATM System
Create class ATM:
private int pin = 1234
Task:
Create method checkPin(int enteredPin)
If correct → print "Access Granted"
Else → print "Wrong Pin"*/

package oops_02.incapsulation;

class ATM{
    private int pin = 1234;

    public void checkPin(int enteredPin){
        if(enteredPin == pin){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Wrong Pin");
        }
    }
}
public class AtmMachine {
    public static void main(String[] args){
        ATM p1=new ATM();
        p1.checkPin(1234);
    }
}
