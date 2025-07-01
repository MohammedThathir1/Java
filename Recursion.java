public class Recursion {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
    }
    static int fact(int n){
        if(n==1) return n;
       
        return n*fact(n-1);  
    }
}
