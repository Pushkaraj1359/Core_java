public class Demo123 {
    int id;
    String name;
    int marks;


    public Demo123(){
        id=1;
        name = "Pushkaraj";
        marks = 87;
    }

    void showStudentDetails(){
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.out.println("marks :"+marks);
    }

    void UpdateDetails(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    // only id 
    int getStudentId(){
        return id;
    }

    // only name
    String getStudentName(){
        return name;
    }

    // set Student id
    void setStudentId(int id){
        this.id=id;
    }

    // set student name
    void setStudentName(String name){
        this.name=name;
    }







    public static void main(String[] args){


        Demo123 d1 = new Demo123();

        d1.showStudentDetails();

        d1.UpdateDetails(01,"KPS",86);

        System.out.println(d1.getStudentId());

        d1.setStudentName("PBSK");
        System.out.println(d1.getStudentName());

    }
}
