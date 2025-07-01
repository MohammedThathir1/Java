import java.util.*;
public class Convert {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //Acessing the element of arraylist using different ways: 
        //for each loop
        list.forEach(n-> System.out.print(n + " "));
        System.out.println();

        //simple for loop:
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Enhanced for loop:
        for(int num: list){
            System.out.print(num + " ");
        }
        System.out.println();

        //using Iterator interface:
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
       
    }
    

}
