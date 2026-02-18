/*
Read-Only Class
Create class Company:
private String companyName = "TCS"

Task:
Only getter
Try modifying from main (should not be possible) */

package oops_02.incapsulation;

class Company {

    private String companyName = "TCS";

    // Only Getter (Read-Only)
    public String getCompanyName() {
        return companyName;
    }
}

public class TestCompanyReadOnly {

    public static void main(String[] args) {

        Company c1 = new Company();

        // Allowed (Reading)
        System.out.println("Company Name: " + c1.getCompanyName());

        // Not Allowed (No Setter)
        // c1.companyName = "Infosys";   // ERROR
        // c1.setCompanyName("Infosys"); // ERROR
    }
}
