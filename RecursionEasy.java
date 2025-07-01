import java.util.Scanner;

public class RecursionEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for Fibonacci: ");
        int num = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        fibo(num-2,0,1);
    }

    public static void fibo(int n, int num1, int num2){
        if(n==0) return;
        int sum = num1+num2;
        System.out.println(sum);
        fibo(n-1, num2, sum);
    }

    public static void paliString(String s){

    }
}
