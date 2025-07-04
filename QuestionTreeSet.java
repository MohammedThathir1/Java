import java.util.*;
public class QuestionTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter length for 1 set.");
        int n = sc.nextInt();
        Set<String> set1 = new TreeSet<>();
        System.out.println("Enter Elements for first set: ");
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            set1.add(str);    
        }
        
        
       System.out.println("Enter length for 2 set.");
        int m = sc.nextInt();
        Set<String> set2 = new TreeSet<>();
        System.out.println("Enter Elements for second set: ");
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            set2.add(str);
        }
        
        Set<String> set3 = new TreeSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println("Combine String is: " + set3);
      
        Set set4 =new TreeSet<>();
        for (String str : set2) {
            if(set1.contains(str)){
                set4.add(str);
                set1.remove(str);
            } 
        }
     
        System.out.println("Common: " + set4);
        System.out.println( "Unique Elements are: " + set1);
        
    }
}
