class Vehicle{
    String model;
    private int speed;

    Vehicle() {
        model = "SUV";
        speed = 20;
        System.out.println("Constructor is Called!");
    }

    Vehicle(Vehicle v2) {
        this();
        this.model = v2.model;
        this.speed = v2.speed;
    }

    void displayEmptyMessage() {
        System.out.print("");
    }

}

public class This_Method {
    public static void main(String args[]) {
        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle(v1);

        v1.displayEmptyMessage();
        v2.displayEmptyMessage();
    }
}
