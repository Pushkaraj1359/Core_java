package opps.inheritance.project02;

class Shape {
    static void draw() {
        System.out.println("draw for shape");
    }

    static void erase() {
        System.out.println("erase for shape");
    }
}

class Square extends Shape {
    static void draw() {
        System.out.println("draw for square");
    }

    static void erase() {
        System.out.println("erase for square");
    }
}

class Circle extends Shape {
    static void draw() {
        System.out.println("draw for circle");
    }

    static void erase() {
        System.out.println("erase for circle");
    }
}

class Triangle extends Shape {
    static void draw() {
        System.out.println("draw for triangle");
    }

    static void erase() {
        System.out.println("erase for triangle");
    }
}

public class App {
    public static void main(String[] args) {

        Shape.draw();
        Shape.erase();
        Square.draw();
        Square.erase();
        Circle.draw();
        Circle.erase();
        Triangle.draw();
        Triangle.erase();
    }
}