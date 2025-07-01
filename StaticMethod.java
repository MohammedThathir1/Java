/* class AccessMethod{

    //static variable
    static int a = 20;

    //static method
    public static void staticNew(){
        System.out.println("This is Static Method....");
    }

    //non static variable
    int b = 30;

    //non static method
    public void nonStatic(){
        System.out.println("This is non Static Method....");
    }
} 

public class StaticMethod {
    public static void main(String[] args) {
        
        // Access Static ...
        //System.out.println("This is static variable a : " + AccessMethod.a);
        //static method call
        //AccessMethod.staticNew();

        //Making object = new AccessMethod
        //and referance variable ab
        //AccessMethod ab = new AccessMethod();
        //non static variable call
        //System.out.println("This is Non Static Variable b : " + ab.b);
        //NonStatic method call
        //ab.nonStatic();
    }
}
*/

/* int z = 12345678907777;
int y = 1234567891234;
int sum = z + y; */

/* import java.util.Scanner;
public class StaticMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = x + y;
        System.out.println("Value X :" + result);
        sc.close();
    }
} */

/* 
import java.util.*;

public class StaticMethod {
    public static void main(String[] args) {
    
       
        Scanner sc = new Scanner(System.in);
        String even = "";
        String odd = "";
        String s = sc.nextLine();
        for(int i = 0;i < s.length(); i++){
             if(i % 2 == 0){
                 even += s.charAt(i);
             } else {
                 odd += s.charAt(i);
             }
        }
        System.out.println(even + " " + odd);
        sc.close();
            }
        } */

/* public class StaticMethod {
    
    static int x = 1;
    static int y;
    static{
        System.out.println("Excuting_1");
        System.out.println(x);
        senti();
    }
    static{
        System.out.println("Excuting2");
        System.out.println(y);
    }
    public static void senti(){
        System.out.println("Method Excuting");
        System.out.println(x + " " + y);
    }
    public static void main(String[] args) {
        
        System.out.println("MainExcuting");
        senti();
    
    }
} */

/* import java.util.Scanner;

public class StaticMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] senti = new int[3];
        for(int i = 0; i < senti.length; i++){
            senti[i] = sc.nextInt();
        }
        for(int i = 0; i < senti.length; i++){
            System.out.println(senti[i]);
        }        
    }
} */