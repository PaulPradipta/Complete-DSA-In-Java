class Car {
    // Instance Variables are stored in Stack Memory
    String carName;
    private int speed;

    // Behaviour
    void accelerate(int acceleration) {
        speed += acceleration;
    }

    int getCurrentSpeed() {
        return speed;
    }
}

public class Class_Demo {
    public static void main(String[] args) {
        // Objects are stored in Heap Memory
        Car obj = new Car();
        obj.carName = "Swift Dzire";
        obj.accelerate(20);
        System.out.println("Current Speed of the Car : " + obj.getCurrentSpeed());
    }
}