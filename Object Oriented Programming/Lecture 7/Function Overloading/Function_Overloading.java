class Calculator {
    int add(int n1, int n2) {
        System.out.println("int int");
        return n1+n2;
    }

    double add(double n1, double n2) {
        System.out.println("double double");
        return n1+n2;
    }

    int add(int n1, int n2, int n3) {
        System.out.println("int int int");
        return n1+n2+n3;
    }
}

public class Function_Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(5,10));
        System.out.println(obj.add(15,16.7));
        System.out.println(obj.add(1,2,3));
    }
}
