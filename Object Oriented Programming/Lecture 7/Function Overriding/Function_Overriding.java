class Device {
    void charge() {
        System.out.println("Device is Charging");
    }
}

class Phone extends Device {
    void charge() {
        System.out.println("Phone is charging with Type-C Cable");
    }
}

class SmartWatch extends Device {
    void charge() {
        System.out.println("Smartwatch is charging wirelessly");
    }
}
public class Function_Overriding {
    public static void main(String[] args) {
        Device obj = new Phone();
        obj.charge();

        Device obj2 = new SmartWatch();
        obj2.charge();
    }
}
