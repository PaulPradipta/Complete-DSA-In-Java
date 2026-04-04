interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println(amount + " paid via UPI");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println(amount + " paid via Credit Card");
    }
}

public class Interface {
    public static void main(String args[]) {
        Payment p1 = new UPI();
        p1.pay(1500);

        Payment p2 = new CreditCard();
        p2.pay(2000);
    }
}
