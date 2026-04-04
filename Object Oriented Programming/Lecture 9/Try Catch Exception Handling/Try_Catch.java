import java.util.Scanner;

public class Try_Catch {
    public int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int val = 0;

        try{
            val = sc.nextInt();
        }catch(Exception e) {
            System.out.println("Failed : " + e);
        }

        sc.close();
        return val;
    }
    public static void main(String args[]) {
        Try_Catch obj = new Try_Catch();
        System.out.print("Enter a Number : ");
        int value = obj.getUserInput();
        System.out.println("Number : " + value);
    }
}
