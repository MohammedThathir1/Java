import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        String EOF = "Read me until end-of-file.";
        while(true){
            String line = sc.nextLine();
            System.out.println(temp + " " + line);
            if ((line.compareTo(EOF)) == 0) {
                break;
            }
            temp++;       
            
        }
        sc.close();
    }
}