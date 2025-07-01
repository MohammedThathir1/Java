import java.util.concurrent.*;
public class ConCurrent {
    public static void main(String args[]){
        //Fail Safe Class
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(200);
        list.add(300);
        list.add(100);
        list.add(400);

        for (int n : list) {
            System.out.print(n); // 200 300 100 400
            list.add(1000); // ConCurrency modifying with printing in the same time.
        }

        System.out.println(list); // [200, 300, 400, 1000, 1000, 1000, 1000]
    }
}
