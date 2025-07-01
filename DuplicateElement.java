public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
       System.out.println(mathSum(arr));
       System.out.println(byBinary(arr));
    }
    public static int byBinary(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(start == end || mid == start) return arr[start];
            else if(arr[mid] == mid) end = mid-1;
            else start = mid+1;
        }
        return 0;
    } 
    public static int mathSum(int[]arr){
        int sum = 0;
        int m=arr.length-1;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];  
        }
        int result = (m*(m+1))/2;
        int duplicateElement = sum - result;
        return duplicateElement;
    }
}
