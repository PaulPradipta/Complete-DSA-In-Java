class Vehicle {
    String model;
    private int speed;

    // Default Constructor
    Vehicle() {
        model = "Alto 800";
        speed = 50;
        System.out.println("Vehicle Name : " + model);
        System.out.println("Speed of the Vehicle : " + speed);
    }

    void messageForFirstVehicle() {
        System.out.println("Details Displayed Sucessfully");
    }

    // Parameterised Constructor
    Vehicle(String model, int speed) {
        // this.model refers to the Instance Variable of the class Vehicle and model refers to the parameter of the Parameterised Constructor whose value is passed from the main method 
        this.model = model;
        this.speed = speed;
        System.out.println("Vehicle Name of the 2nd Vehicle : " + model);
        System.out.println("Speed of the 2nd Vehicle : " + speed);
    }

    void messageForSecondVehicle() {
        System.out.println("Details of 2nd Vehicle Displayed Successfully");
    }

}

public class Parameterised_Constructor {
    public static void main(String args[]) {
        Vehicle v1 = new Vehicle();
        v1.messageForFirstVehicle();

        Vehicle v2 = new Vehicle("Ferrari", 80);
        v2.messageForSecondVehicle();
    }
}
