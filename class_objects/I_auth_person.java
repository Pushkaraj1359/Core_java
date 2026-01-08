class Author{
    String name;
    String email;
    char gender;


    Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    String getName(){
        return name;
    }

    String getEmail(){
        return email;
    }


    void setEmail(String email){
        this.email=email;
    }

    char getGender(){
        return gender;
    }

    void print(){
        System.out.println(name+" ("+gender + ") "+email);
    }
}

class Person{
    String name;
    int age;

    Person(String initailName){
        this.name = initailName;
        this.age=0;
    }

    void printPerson(){
        System.out.println("person name= "+this.name +" person age ="+this.age);
    }

    void growOlder(){
        age++;
    }

    int returnAge(){
        return age;
    }

    boolean ofLegalAge(){
        return 18 > age;
    }

    String getName(){
        return name;
    }

    


}



public class I_auth_person {
    public static void main(String[] args){
        Author a = new Author("pushkaraj","pushu@gmail.com",'m');
        a.print();

        a.setEmail("kulkarni11@gmail.com");
        System.out.println("after the EMAIL is update");
        a.print();

    }
}
