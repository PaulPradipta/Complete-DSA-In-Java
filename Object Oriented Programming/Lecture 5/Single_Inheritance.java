class Animal {
    protected int numberOflegs;

    void eat() {
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dogs bark");
    }
}
public class Single_Inheritance {
    public static void main(String args[]) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
        obj.numberOflegs = 4;
        System.out.println("Number of Legs a Dog has : " + obj.numberOflegs);
    }
}
