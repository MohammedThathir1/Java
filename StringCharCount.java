import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //count(str);
        //arrayCount(str);
        //forCount(str);
        sc.close();
    }

    /* static void forCount(String s){
        StringBuilder sb = new StringBuilder(s);
        char ch=' ';
        boolean check=true;
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            for (int j = i; j < sb.length(); j++) {
                System.out.println(s.charAt(i));
                if(s.charAt(i)=='*'){ 
                    check = false;
                    break;}
                if(s.charAt(j)==s.charAt(i)){
                    count++;
                    ch=s.charAt(j);
                    s.replace(ch, '*');
                }
                
            }
           
            if(check){System.out.print(s.charAt(i) + " " + count + " -- " + s);}
        }
    } */

    static void arrayCount(String s){
       char[] ss = s.toCharArray();
       Arrays.sort(ss);
      
       int j=0;
       int count=0;
       System.out.println();
       for(int i=0; i < ss.length; i++) {  
            if(ss[i] !=ss[j]){ 
                System.out.print(ss[j] + " " + count + " -- ");
                count=1;
                j=i;
            } else{ 
                count++;
            }
       }
       System.out.print(ss[ss.length-1] + " " + count + " -- ");
    }


    static void count(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        System.out.println();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " -- ");
        }
    }
}