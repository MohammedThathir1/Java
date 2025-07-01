import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
public class Hash{
    public static void main(String args[]) throws Exception{  // For Handling the exception for thread class
        //HashMap vs WeakHashMap vs IdentityHashMap
        HashMap map = new HashMap();
        String obj1 = "Senti";  // Give memory String Pool
        String obj2 = "Badal";
        String obj3 = "Basil";        
        map.put(1,obj1);
        map.put(2,obj2);
        map.put(3,obj3);
        obj1 = null;    //delete object1
        System.gc();    //Request Garbage Collection
        System.out.println(map); // output: {1=Senti, 2=Badal, 3=Basil}

        WeakHashMap weakMap = new WeakHashMap();
        String obj4 = new String("Senti"); // Give memory in Heap
        String obj5 = new String("Badal");
        String obj6 = new String("Basil");
        weakMap.put(obj4,1);
        weakMap.put(obj5,2);
        weakMap.put(obj6,3);
        obj4 = null;    // delete object4
        System.gc();    // Request Garbage Collection
        Thread.sleep(2000);    // Add delay of program for 2 sec
        System.out.println(weakMap);    // output: {Badal=2, Basil=3}
        
        IdentityHashMap idMap = new IdentityHashMap(); 
        String obj7 = new String("Senti"); // Both are Different object because of new  
        String obj8 = new String("Senti"); // we can not this in simple HashMAp map
        idMap.put(obj7, "CGPA: 8.0");
        idMap.put(obj8, "CGPA: 8.5");
        System.out.println(idMap); // output: {Senti=CGPA: 8.5, Senti=CGPA: 8.0}
    }
}