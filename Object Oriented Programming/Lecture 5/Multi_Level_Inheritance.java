class LivingBeing {
    void breathe() {
        System.out.println("Living Beings breathe");
    }
}

class Human extends LivingBeing{
    void walk() {
        System.out.println("Humans can walk");
    }
}

class Employee extends Human {
    void work() {
        System.out.println("Employee works in office");
    }
}
public class Multi_Level_Inheritance {
    public static void main(String args[]) {
        Employee obj = new Employee();
        obj.breathe();
        obj.walk();
        obj.work();
    }
}
