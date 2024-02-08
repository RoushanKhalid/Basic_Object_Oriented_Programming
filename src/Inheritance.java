class Shape {
    String color;

    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Called from Triangle extends Shape");
        System.out.println("Triangle Area: " + 0.5 * l * h);
    }
}

class EquiLateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println("Called from EquiLateralTriangle extends Triangle");
        System.out.println("Equilateral Triangle Area: " + 0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Called from Circle extends Shape");
        System.out.println("Circle Area: " + 3.1416 * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");

        Triangle t1 = new Triangle();
        t1.color = "Black";
        System.out.println("Triangle Color: " + t1.color);
        t1.area(5, 8);

        EquiLateralTriangle eqT = new EquiLateralTriangle();
        eqT.color = "Blue";
        System.out.println("Equilateral Triangle Color: " + eqT.color);
        eqT.area(6, 6);
        Circle c1 = new Circle();
        c1.color = "Red";
        System.out.println("Circle Color: " + c1.color);
        c1.area(5);
    }
}