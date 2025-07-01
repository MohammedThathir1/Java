import java.util.Scanner;
public class RecursionQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for printing");
        int num = sc.nextInt();
        numberPrint(num,1);
        
        System.out.println("Enter n for Factorial");
        int num1 = sc.nextInt();
        System.out.println(fact(num1));

        System.out.println("Enter n for Sum");
        int num2 = sc.nextInt();
        System.out.println(sumNum(num2));

        System.out.println("Enter String for reverse");
        String str = sc.next();
        reverse(str,str.length()-1);
    }

    public static void numberPrint(int n,int i){
        if(n==i){ 
            System.out.println(n);
            return;
        }
        System.out.println(i);
        numberPrint(n,++i);
    }

    public static int fact(int n){
        if(n==0) return 1;
        return n * fact(n-1);
    }

    public static int sumNum(int n) {
        if(n==1) return 1;
        return n + sumNum(n-1);
    }

    public static void reverse(String s, int idx){
        if(idx==-1) return;
        char str = s.charAt(idx);
        System.out.print(str);
        reverse(s, idx-1);
    }
}
