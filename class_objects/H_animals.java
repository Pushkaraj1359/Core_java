class Dog{
    String name;
    int age;
    String color;

    Dog(){
        name="seru";
        age=4;
        color="white";
    }

    void showDogDetails(String name, int age, String color){
        System.out.println(this.name=name);
        System.out.println(this.age=age);
        System.out.println(this.color=color);
    }

    void walk(){
        System.out.println(name+" is walking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }
}

public class H_animals {
    public static void main(String[] args) {
        
        Dog d1=new Dog(); 
        d1.name="seru";
        d1.showDogDetails("tommy",2,"gray");
        
        Dog d2=new Dog();
        d2.name="tommy";

        d1.walk();
        d2.bark();
    }
}
