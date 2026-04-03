class Vehicle{
    String model;
    private int speed;

    Vehicle() {
        model = "SUV";
        speed = 80;
        System.out.println("Current Speed = " + speed);
    }

    void accelerate(int acceleration) {
        speed = speed + acceleration;
        System.out.println("Current Speed = " + speed);
    }

    int getCurrentSpeed() {
        return speed;
    }
}

public class Copy_Constructor_2nd_Example {
    public static void main(String args[]) {

        System.out.println("Speed of Vehicle v1 : ");
        Vehicle v1 = new Vehicle();
        
        Vehicle v2 = v1;
        System.out.println("Speed of Vehicle v2 : ");
        v2.accelerate(20);

        System.out.println("Speed of Vehicle v1 : " + v1.getCurrentSpeed());
    }
}
