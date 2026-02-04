package inheritance;

import inheritance.src.p1.Circle;
import inheritance.src.p2.Cylinder;

public class main {
    public static void main(String[] args) {
        Circle r1 = new Circle(1.2,"white");
        Cylinder r2 = new Cylinder(1.2,12.33);
        r1.displaydetails();
    }
}
