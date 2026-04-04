interface Printer {
    void print(String document);

    void switchOn();
}

interface Scanner {
    void scan(String document);

    void switchOn();
}

class MultiFunctionalityMachine implements Printer, Scanner {
    
    public void switchOn() {
        System.out.println("Powering On");
    }

    public void print(String document) {
        System.out.println(document + " is being printed");
    }

    public void scan(String document) {
        System.out.println(document + " is being scanned");
    }
}
public class Multiple_Inheritance_Using_Interface {
    public static void main(String args[]) {
        MultiFunctionalityMachine obj = new MultiFunctionalityMachine();
        obj.switchOn();
        obj.print("Report Card");
        obj.scan("Aadhar Card");
    }
}
