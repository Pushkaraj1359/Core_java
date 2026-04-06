package inheritance.src.p1;

//circle is an class...........
public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle() {
        System.out.println(radius);
        System.out.println(color);
    }


    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;  
    }

    public double getArea(){
        return 3.14*radius*radius;
    } 

    public void displaydetails(){
        System.out.println("Radius :"+radius);
        System.out.println("Radius :"+color);
    }
}
