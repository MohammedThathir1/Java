import java.util.Scanner;

public class RecursionEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for Fibonacci: ");
        int num = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        fibo(num-2,0,1);
        
        System.out.println("Enter String for Palindrome: ");
        String str = sc.next();
        System.out.println(paliString(str,0,str.length()-1));

        System.out.println("Enter and number and power: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(pow(num1,num2));

        System.out.println("Enter number for count: ");
        int number = sc.nextInt();
        countNumber(number,0);

        System.out.println("Enter array to check Sorted or not");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted : " + sortOrNot(arr, 0));
    }

    public static void fibo(int n, int num1, int num2){
        if(n==0) return;
        int sum = num1+num2;
        System.out.println(sum);
        fibo(n-1, num2, sum);
    }

    public static boolean paliString(String s, int first, int last){

        if(first == last) return true;
        if(first>last) return true;

        if(s.charAt(first) == s.charAt(last)){
            first++;
            last--;
            return paliString(s, first, last);
        }
        return false;
    }

    public static int pow(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;

        return x * pow(x,--n);
    }

    public static void countNumber(int number, int count){
        if(number==0){
            if(count == 0) System.out.println("Number of digits is: 1");
            else System.out.println("Number of digits is: "+ count);
            return;
        }
        number/=10;
        count++;
        countNumber(number, count);
    }

    public static boolean sortOrNot(int arr[], int idx){
        if(idx == arr.length-1) return true;

        if(arr[idx] <= arr[idx+1]){
            return sortOrNot(arr, ++idx);
        }

        return false;
    }
}
