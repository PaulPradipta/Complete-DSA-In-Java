class Animal {
    void eat() {
        System.out.println("Animal eat Food");
    }
}

class Dolphin extends Animal {
    void swim() {
        System.out.println("Dolphin can swim");
    }
}

public class Object_Class {
    public static void main(String args[]) {
        Dolphin obj = new Dolphin();
        obj.getClass();
        obj.eat();
        obj.swim();
    }
}
