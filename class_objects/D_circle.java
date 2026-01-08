class Circle{

    double  radius;
    String  color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double r){
        this.radius=r;
    }

    public Circle(double r, String c){
        this.radius=r;
        this.color=c;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    } 
    
    public double getArea(){
        return 3.14*radius*radius;   
    }

}   



public class D_circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0,"blue");    
        System.out.println(c1.getRadius());         
        Circle c2 = new Circle(2.0);               
        Circle c3 = new Circle();                   

        System.out.println("the radius of c1 is = "+ c1.getRadius());
        System.out.println("the  of color c1 is = "+ c1.getColor());
        System.out.println("the Area of c1 is = "+ c1.getArea());
        System.out.println("the radius of c2 is = "+ c2.getRadius());
        System.out.println("the  of color c2 is = "+ c2.getColor());
        System.out.println("the Area of c2 is = "+ c2.getArea());
    }
}

