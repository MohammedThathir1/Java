import java.util.Scanner;

public class Ab {
 
    /**
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("hello");
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number");
        int no1 = num.nextInt();
        System.out.println("Enter number");
        int no2 = num.nextInt();
                         // or we use XOR(^) operator like this:
        no2 = no1 - no2; //no2 = no1 ^ no2;
        no1 = no1 - no2; //no1 = no1 ^ no2;
        no2 = no1 + no2; //no2 = no1 ^ no2;

        System.out.println(no1 + " " + no2);

        
        num.close();
    }
}
