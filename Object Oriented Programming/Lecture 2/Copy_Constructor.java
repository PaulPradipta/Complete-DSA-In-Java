class Vehicle{
    String model;
    private int speed = 10;

    Vehicle() {
        model = "SUV";
        speed = 80;
        System.out.println("Current Speed = " + speed);
    }

    Vehicle(Vehicle v2) {
        this.model = v2.model;
        this.speed = v2.speed;
    }

    void accelerate(int acceleration) {
        speed = speed + acceleration;
        System.out.println("Current Speed = " + speed);
    }

    int getCurrentSpeed() {
        return speed;
    }
}

public class Copy_Constructor {
    public static void main(String args[]) {

        System.out.println("Speed of Vehicle v1 : ");
        Vehicle v1 = new Vehicle();
        
        Vehicle v2 = new Vehicle(v1);
        System.out.println("Speed of Vehicle v2 : ");
        v2.accelerate(20);

        System.out.println("Speed of Vehicle v1 : " + v1.getCurrentSpeed());
    }
}
