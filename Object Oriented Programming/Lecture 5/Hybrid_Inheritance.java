class Person {
    void sleep() {
        System.out.println("Person can sleep");
    }
}

class Engineer extends Person {
    void work() {
        System.out.println("Engineer can work");
    }
}

class HR extends Person {
    void hire() {
        System.out.println("HR can hire persons");
    }
}

class TeamLead extends Engineer {
    void manage() {
        System.out.println("Team Lead manages project");
    }
}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        HR obj1 = new HR();
        obj1.sleep();
        obj1.hire();

        TeamLead obj2 = new TeamLead();
        obj2.sleep();
        obj2.work();
        obj2.manage();
    }
}
