public class Recression {
    public static void main(String[] args) {
        int[] arr = {1,5,5,6,5};
        int element = 2;
        System.out.println(count(arr,element,0));    
    }

    static int  first = -1;
    static int last = -1;

    public static String count(int num[],int element,int idx){
        
        if(idx == num.length) return "First: " + first + " last: " + last;
        
        if(num[idx] == element){
            if(first == -1) first = idx;
            else last = idx;
        }
        return count(num ,element, idx+1);
    }
}
