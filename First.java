import java.util.*;
class First{

    public static void main(String args[]){
      try (Scanner nam = new Scanner(System.in)) {
        System.out.println("enter name");
        String name = nam.nextLine();
        System.out.println("name = "+name);
         String s= "hello";
         System.out.println(s+" "+name);
      }
    } 
}