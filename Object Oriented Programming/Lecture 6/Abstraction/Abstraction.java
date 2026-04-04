abstract class Shape {
    Shape() {
        System.out.println("Class Shape is Called!");
    }

    abstract void area();

    void display() {
        System.out.println("Shapes");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Circle Area : " + area);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(15,10);
        s1.area();
        s1.display();
    }
}