import java.util.*;
public class PrimePalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PrimePalindrom main  = new PrimePalindrom();
        boolean check = main.pali(number);
        boolean checked = main.prime(number);

        if(check && checked) System.out.println("Yes , Prime Palindrome");
        else System.out.println("No");

        sc.close();
    }

    public boolean pali(int number){
         
        for(int i=2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public boolean prime(int number) {
        int org = number;
        int result = 0; 
        while(number > 0){
            int num = number % 10;
            result = result *10 + num;
            number = number/ 10;
        }
        
        return result == org;
    }
}
