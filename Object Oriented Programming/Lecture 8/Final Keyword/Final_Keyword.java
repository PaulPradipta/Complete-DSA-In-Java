class A {
    final int speed = 20;

    // Values of Varaibles with Final Keyword cannot be changed
    // void updateSpeed() {
    //     speed = 30;
    // }

    final void display() {
        System.out.println("Parent Class Displayed !");
    }
}

class B extends A {
    // Methods declared with final keyword cannot be overrided
    // void display() {
    //    System.out.println("Child Class Displayed !");
    // }
}

final class C {
    String name;
}

// classes declared with final keyword cannot be inherited
// class D extends C {

// }

public class Final_Keyword {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
