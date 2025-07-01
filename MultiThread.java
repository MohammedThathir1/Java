public class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        Writing wt = new Writing();
        Debugingg dt = new Debugingg();
        Saving st = new Saving();
        wt.start();
        dt.start();
        st.start();
        Num num = new Num();
        Alpha alpha = new Alpha();

        Thread t1 = new Thread(num);
        Thread t2 = new Thread(alpha);

        t1.start();
        t2.start();
        t1.join();
        t2.join(); // Main thread will paused util these threads don't completed there tasks...

        System.out.println("Program is Ended....");
    }
}
class Num implements Runnable{
    public void run() {
        try {
            Thread.currentThread().setName("Number");
            System.out.println(Thread.currentThread().getName());
            for(int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...");
        }
    }   
}
class Alpha  implements Runnable{
    public void run() {
        try {
            Thread.currentThread().setName("Alpha");
            System.out.println(Thread.currentThread().getName());
            for(char i='a'; i<='e'; i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...");
        }
    }   
}
class Writing extends Thread {
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            for (int i = 0; i < 10; i++) {
                System.out.println("Writing....");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...");
        }

    }
}

class Debugingg extends Thread {
    public void run() {
       try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            for (int i = 0; i < 10; i++) {
                System.out.println("Debugingg....");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...");
        }
    }
}

class Saving extends Thread {
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            for (int i = 0; i < 10; i++) {
                System.out.println("Saving....");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...");
        }
    }
}