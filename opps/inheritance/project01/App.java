package opps.inheritance.project01;

// import inheritance.main;

public class App {
    public static void main(String[] args) {
        
        Shape s1=new Circle(5.2, "orange ",true);
        System.out.println(s1);
        System.out.println("Circle Area = "+s1.getArea());
        System.out.println("Circle perimeter = "+s1.getPerimeter());

        Rectangle r1=new Rectangle();
        System.out.println(r1);
        System.out.println(" Rectangle area = "+r1.getArea());
        System.out.println("Rectangle perimeter ="+r1.getPerimeter());

        
        Square sq1=new Square(5.2,"white",true);
        System.out.println(sq1);
        System.out.println("Square Area = "+sq1.getSide());
        System.out.println("square perimeter = "+sq1.getLength());
        System.out.println("square perimeter = "+sq1.getWidth());
    }
}
