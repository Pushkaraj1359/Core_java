class Account{
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    int getAccountNumber(){
        return accountNumber;
    }

    double getBalance(){
        return balance; 
    }

    void setBalance(double balance){
        this.balance=balance;
    }

    void credit(double amount){
        balance=balance+amount;
        System.out.println("the credited amount is = "+balance);
    }

    void debit(double amount){
        balance=balance-amount;
        System.out.println("the debited amount is = "+balance);
    }

    void showDetails(){
        System.out.println("AccountNumber = "+accountNumber +"balance "+balance);
    }
}



public class E_account {
    public static void main(String[] args) {
        Account a=new Account(123456,1000.32);

        a.credit(500.18);
        a.debit(200.18);
        
        a.showDetails();


    }
}
