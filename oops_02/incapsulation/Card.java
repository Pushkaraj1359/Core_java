package oops_02.incapsulation;

class Details{
    private int rollNo;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String course;
    private int marks;
    private String grade;
    private boolean isActive; 

    public Details(){

    }

    public  Details( int rollNo,
        String name,
        int age,
        String gender,
        String email,
        String phone,
        String address,
        String course,
        int marks,
        String grade,
        boolean isActive ){
            setRollNo(rollNo);
            setName(name);
            setAge(age);
            setGender(gender);
            setEmail(email);
            setMobile(phone);
            setAddress(address);
            setCourse(course);
            setMarks(marks);
            setGrade(grade);
            setisActive(isActive);
        }

    

    public void setRollNo(int rollNo){
        if(rollNo>0 && rollNo<=50){
            this.rollNo=rollNo;
        }
        else{
            System.out.println("Roll No is not valid :");
        }
    }
    public int rollNo(){
        return rollNo;
    }

    public void setName(String name){
        if(name!=null && !name.trim().isEmpty() && name.matches("^[a-zA-Z ]{3,}$")){
            this.name=name;
        }
        else{
            System.out.println("Name is not valid");
        }
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        if(age>0 && age<=100){
            this.age=age;
        }
        else{
            System.out.println("Age is not valid :");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        if(gender!=null && gender.matches("(?i)M|F")){   // Allow M or F 👉 Uppercase or lowercase both allowed
            this.gender=gender;
        }
        else{
            System.out.println("Gender is invalid:");
        }
    }
    public String getGender(){
        return gender;
    }

    public void setEmail(String email){
        if(email!=null && email.matches("^[a-zA-Z0-9]+@gmail\\.com$")){
            this.email=email;
        }
        else{
            System.out.println("email is invalid:");
        }
    }
    public String getEmail(){
        return email;
    }

    public void setMobile(String phone){
        if(phone!=null && phone.matches("^[0-9]{10}")){
            this.phone=phone;
        }
        else{
            System.out.println("Phone No is Invalid:");
        }
    }
    public String getPhone(){
        return phone;
    }

    public void setAddress(String address){
        // full name used this pattern 
        // if(address!=null && address.matches("^[a-zA-Z]+( [a-zA-Z]+)*$")){
        //     this.address=address;
        // }
        

        if(address != null && address.matches("^[a-zA-Z0-9\\s,.-]{5,}$")){
            this.address = address;
        }
        else{
            System.out.println("address is invalid:");
        }
    }
    public String getAddress(){
        return address;
    }

    public void setCourse(String course){
        if(course!=null && course.matches("(?i)(Python | Java | C)")){
            this.course=course;
        }
        else{
            System.out.println("course is invalid:");
        }
    }
    public  String getCourse(){
        return course;
    }

    public void setMarks(int marks){
        if(marks>0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("mark is Invalid:");
        }
    }
    public int getMarks(){
        return marks;
    }

    public void setGrade(String grade){
        if(grade!=null && grade.matches("(?i)A|B|C|D")){
            this.grade=grade;
        }
        else{
            System.out.println("grae is invalid:");
        }
    }
    public String getGrade(){
        return grade;
    }

    public void setisActive(boolean isActive){
        if(isActive==true){
            this.isActive=isActive;
        }
        else{
            System.out.println("not active");
        }
    }
    public boolean isActive(){
        return isActive;
    }

    public void displayDetails(){
        System.out.println("rollNo :"+rollNo);
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("gender :"+gender);
        System.out.println("email "+email);
        System.out.println("phone "+phone);
        System.out.println("address "+address);
        System.out.println("course "+course);
        System.out.println("marks "+marks);
        System.out.println("grade "+grade);
        System.out.println("isActive "+isActive);
    }
}
public class Card {
    public static void main(String[] args) {
        Details d1=new Details(50,"pushkaraj",23,"M",
        "pushkaraj123@gmail.com","9637510000","at. post honali",
        "Java",86,"A",true);

        d1.displayDetails();
    }
}
