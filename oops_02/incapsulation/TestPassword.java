package oops_02.incapsulation;

class Password {

    private String password;

    // Only setter (Write-Only)
    public void setPassword(String password) {
        if(password != null && !password.trim().isEmpty()){
            this.password = password;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Invalid password");
        }
    }

    // No getter — Cannot read password from outside
}

public class TestPassword {
    public static void main(String[] args) {
        Password p1 = new Password();

        // Set password
        p1.setPassword("MySecret123");

        // Trying to read will fail
        // System.out.println(p1.password);   // ERROR
        // System.out.println(p1.getPassword()); // ERROR
    }
}
