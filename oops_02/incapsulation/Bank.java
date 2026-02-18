/*BankAccount
Create class BankAccount:
private double balance

Rules:
balance cannot be negative
If negative value is given, print "Invalid amount"
👉 Add validation inside setter. */


package oops_02.incapsulation;

class BankAccount{
    private double balance;
    private double amount;

    public BankAccount(){

    }

    public BankAccount(double balance){
        setBalance(balance);
    }

    public void setBalance(double balance){
        if(balance > 0 ){
            this.balance=balance;
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }

    public void setDeposit(double amount){
        if(amount >=0){
            balance+=amount;
        }
        else{
            System.out.println("invalid amount");
        }
    }

    public void withdraw(double amount){
    if(amount > 0){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    } else {
        System.out.println("Invalid withdraw amount");
    }
}

    public void showBalace(){
        System.out.println("Balance :"+balance);
    }
}

public class Bank {
    public static void main(String[] args){
        BankAccount b1=new BankAccount(12342.23);
        b1.showBalace();
        b1.setDeposit(200.22);
        b1.showBalace();
        b1.setwithdraw(112500);
        b1.showBalace();
    }
}
