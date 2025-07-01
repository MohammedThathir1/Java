import java.util.*;
public class Aa {
    /**
     * @param args
     */
  /*   static{
        Aa a = new Aa();
        a.main(null);
    }
 */    public static void main(String name[]) {
       /*  int arr[]={1,2,3,4,5};
        
        for(int i=0;i<=4;i++){
        System.out.println(arr[i]);
        } */

        Name name1 = new Name("Senti", 001);
        Name name2 = new Name("Badal", 002);
        
        ArrayList<Name> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        System.out.println(names);
     
    }
    
}

class Name {

    String name;
    int num;

    public Name(String name, int num){
        this.name = name;
        this.num = num;
    }
    @Override //toString is overridden because we want value not address;
    public String toString(){
        return "Name:" + name + " num: " + num;   
    }
}