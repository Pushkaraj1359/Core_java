// package class_objects;

// class country{
//     String name;
//     double population;
//     String capital;

//     country() {
//         name = "India";
//         population = 12343243;
//         capital = "Delhi";
//     }

//     void showDetails(){
//         System.out.println("name "+name);
//         System.out.println("population "+population);
//         System.out.println("capital "+capital);
//     }
    
    
//     // Method to update all values
//     void updateDetails(String name, double population, String capital){
//         System.out.println("name "+name);
//         System.out.println("population "+population);
//         System.out.println("capital "+capital);
//     }

//     String getCapitalName(){
//         return capital;
//     }

//     // simple setter method
//     void setName(String name){
//         this.name=name;
//     }
// }

// public class B_country {
//     public static void main(String[] args) {
//         //object creation
//         country c=new country();
//         c.showDetails();
//         System.out.println("capital name is = "+ c.getCapitalName());

//         country c1=new country();
//         c1.updateDetails("USA", 1343234,"Washington");

//         c.setName("bharat");


//         System.out.println("after updating details");
//         c.showDetails();
//     }
// }





package class_objects;

class country{
    String name;
    double population;
    String capital;

    country() {
        name = "India";
        population = 12343243;
        capital = "Delhi";
    }

    void showDetails(){
        System.out.println("name "+name);
        System.out.println("population "+population);
        System.out.println("capital "+capital);
    }
    
    
    // Method to update all values
    void updateDetails(String name, double population, String capital){
        System.out.println("name "+name);
        System.out.println("population "+population);
        System.out.println("capital "+capital);
    }

    String getCapitalName(){
        return capital;
    }

    // simple setter method
    void setName(String name){
        this.name=name;
    }
}

public class B_country {
    public static void main(String[] args) {
        //object creation
        country c=new country();
        c.showDetails();
        System.out.println("capital name is = "+ c.getCapitalName());

        country c1=new country();
        c1.updateDetails("USA", 1343234,"Washington");

        c.setName("bharat");

        System.out.println("after updating details");
        c.showDetails();
    }
}
