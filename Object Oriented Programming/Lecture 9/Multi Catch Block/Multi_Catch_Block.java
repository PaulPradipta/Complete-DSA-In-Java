
public class Multi_Catch_Block {
    public static void main(String args[]) {

       try {
            int[] arr = {1,2,3};
            System.out.println(arr[2]);

            String name = "Pradipta";
            System.out.println(name.length());

            System.out.println(5/0);
       }
       catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
       }
       catch(NullPointerException e) {
        System.out.println(e);
       }
       catch(ArithmeticException e) {
        System.out.println(e);
       }

    }
}
