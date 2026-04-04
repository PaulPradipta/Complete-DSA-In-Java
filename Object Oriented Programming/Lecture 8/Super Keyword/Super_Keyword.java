class E {
    int speed = 20;

    E() {
        System.out.println("Parent Constructor is Called !");
    }

    E(String name) {
        System.out.println("Hello " + name );
    }

    void display() {
        System.out.println("Parent Class Displayed !");
    }
}

class F extends E {
    int speed = 100;

    F() {
        super("Pradipta");
        System.out.println("Child Constructor");
    }

    void displaySpeed() {
        System.out.println("Child Class Speed = " + speed);
        System.out.println("Parent Class Speed = " + super.speed);
    }

    void display() {
        super.display();
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        F obj = new F();
        obj.displaySpeed();
        obj.display();
    }
}
