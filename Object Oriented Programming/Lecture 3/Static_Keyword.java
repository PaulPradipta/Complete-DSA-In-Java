class Student {
    static String canteenName;
    static String university;

    static {
        System.out.println("Static Block Invoked");
        canteenName = "Cafeteria";
        university = "MAKAUT";
        greet();
    }

    static void greet() {
        System.out.println("Welcome to MAKAUT");
    }

    private String name;
    private int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails() {
        System.out.println(name + " " + rollNumber);
    }
}
public class Static_Keyword {
    public static void main(String args[]) {
        System.out.println(Student.canteenName);

        Student obj = new Student("Rahul",50);
        obj.displayStudentDetails();

        Student.canteenName = "Black Dineout";
        System.out.println(Student.canteenName);
    }
}