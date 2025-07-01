import java.util.*;
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary in LPA: ");
        int salary = sc.nextInt();

        if (salary > 15) {
            System.out.println("Buy a House.");
        } else if (salary < 15) {
            System.out.println("Buy a car.");
        } else if (salary < 10) {
            System.out.println("Buy a Bike.");
        } else {
            System.out.println("Get a Good Job.");
        }
        sc.close();
    }
}
