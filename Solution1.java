import java.util.Arrays;

class Solution1 {
    public static void reverseString(char[] s) {
        String []check = new String[s.length];
        int g = check.length-1;
        for(int i = 0; i < s.length; i++){
            check[g] = "\"" + String.valueOf(s[i]) + "\"";
            g--;
        }
    
        System.out.print(Arrays.toString(check));
    }
    public static void main(String[] args){
        char [] s = {'T','h','a','t','h','i','r'};
        reverseString(s);
    }
}