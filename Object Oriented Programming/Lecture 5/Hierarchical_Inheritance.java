class Appliance {
    void switchOn() {
        System.out.println("Switch On");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan Rotates");
    }
}

class Bulb extends Appliance {
    void glow() {
        System.out.println("Bulb Glows");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String args[]) {
        Fan obj = new Fan();
        obj.switchOn();
        obj.rotate();

        Bulb obj2 = new Bulb();
        obj2.switchOn();
        obj2.glow();
    }
}
