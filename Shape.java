public abstract class Shape {

    abstract double calculateArea();

    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new RectangleTriangle(4, 6);

        System.out.println("Circle Area: " + s1.calculateArea());
        System.out.println("Rectangle/Triangle Area: " + s2.calculateArea());
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class RectangleTriangle extends Shape {

    double base, height;

    RectangleTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;   // triangle area
    }
}