import java.util.*;
public class Arrayquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 D array
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
       
        int num2 = sc.nextInt();
        String[] name = new String[num2];

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }
}
