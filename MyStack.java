import java.util.Arrays;
class Stack {
    private int[] arr;  // Stack using array...
    private int pointer;
    
    public Stack() {
        arr = new int[3];
        pointer = -1;
    }
    public void push(int value) {
        if(arr.length <= pointer+1) resizeLength();
        arr[++pointer] = value;        
    }
    public void pop() {
        if (pointer > -1)   arr[pointer--] = 0;
        else    System.out.println("Stack is Empty.");
    
    }
    public void resizeLength(){
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
        arr = newArr;
    }
    public String toString() {
        return Arrays.toString(arr);
    }
}
public class MyStack {
    public static void main(String[] args) {
        Stack st = new Stack();       
        st.push(10);
        st.push(20);
        st.pop();
        System.out.println(st);
    }
}
