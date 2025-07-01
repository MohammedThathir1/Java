public class SingleThread {
    public static void main(String[] args) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        for (int i = 0; i < 10; i++) {
            System.out.println("Writing....");
            Thread.sleep(500);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Debugingg....");
            Thread.sleep(500);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Saving....");
            Thread.sleep(500);
        }
    }
}
