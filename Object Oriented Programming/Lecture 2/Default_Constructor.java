class Vehicle {
    String model;
    private int speed = 30;

    // Default Constructor
    Vehicle() {
        model = "Honda City";
        speed = 20;
        System.out.println("Vehicle Model : " + model);
        System.out.println("Speed of the Vehicle : " + speed);
    }

    void accelerate(int acceleration) {
        speed = speed + acceleration;
        System.out.println(speed);
    }

}
public class Default_Constructor {
    public static void main(String args[]) {
        Vehicle obj = new Vehicle();
        obj.accelerate(10);
    }
}
