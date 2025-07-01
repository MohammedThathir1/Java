
import java.util.*;

public class Abc {
    /**
     *
     */
   

    /**
     * @param args
     */
    public static void main (String args[]){
      
        try (Scanner sac = new Scanner(System.in)) {
            int n = sac.nextInt();        
            for( int i=1;i<=n;i++){
               
                for (int j = 1; j <= n-i; j++) {

                    System.out.print(" ");
                }
                for (int j = 1; j <=i; j++) {

                    System.out.print("*");
                }
               
            
     
            for (int j = 1; j <=i-1; j++){ 

                System.out.print("*");
                 }
      
                System.out.print("\n");
      
            }
      
      
            for( int i=n;i>=1;i--){
               
                for (int j = 1; j <= n-i; j++) {

                    System.out.print(" ");
                }
                for (int j = 1; j <=i; j++) {

                    System.out.print("*");
                }
               
            
     
            for (int j = 1; j <=i-1; j++){ 

                System.out.print("*");
                 }
      
                System.out.print("\n");
      
            }
        }
    
    
    }

    
}
