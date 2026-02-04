package inheritance.src.p2;
import inheritance.src.p1.*;


public class Cylinder extends Circle {
    double height = 1.0;
    String color;

    public Cylinder(){
        System.out.println(height);
    }

    public void Cylinder(double radius){
        super.setRadius(radius);
    }


    public Cylinder(double radius ,double height){
        super.setRadius(radius);
        this.height=height;
    }

    public Cylinder(double radius ,double height, String color){
        super.setRadius(radius);
        this.height=height;
        super.setColor("red");
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=this.height;
    }

    public double  getVolume(double radius){
        // super.setRadius(radius);
        return 4/3*3.14*radius*radius*radius;
    }

    public void setVolume(double radius){
        super.setRadius(radius);
    }

}
