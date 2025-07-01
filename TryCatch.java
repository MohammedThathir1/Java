import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    {
        System.out.println("Only barkcet.....");
        // This block is call before the constructor
    }
    static {
        System.out.println("Static Block.....");
        // always executed first
    }

    public TryCatch() {
        System.out.println("Constructor......");
        // call when ever you make an object of class
    }

    public static void beta() {
        System.out.println("Beta started");
        int[] arr = new int[-1];
        // Exception occur, SO one exception object made and give to jvm
        System.out.println("Beta ended");
    }

    public static void alpha() throws Exception {
        System.out.println("Alpha stated");
        try {
            beta();
        } catch (NegativeArraySizeException nase) {
            System.out.println("Array cannot be negative...");
            // Here Excetion is occur on beta method so beta method not executed full after
            // exception only alpha method run
            throw nase;
            // exception throw to main because main is calling alpha
        } finally {
            // Use finally so controller first executed this than throw exception to main
            // mathod.
            System.out.println("Alpha ended");
        }
    }

    public static void main(String[] args) throws MyExcepion {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Started");
        try {
            alpha();
        } catch (Exception e) {
            System.out.println("Exception occur in alpha method");
            // e.setStackTrace(null); for displaying the exception
        }
        System.out.println("Enter only 1...");
        int number = sc.nextInt();
        if (number != 1) {
            throw new MyExcepion("Enter number Only 1...");
            // throw keyword is used for calling the class which handle an exception
        }
        try {
            System.out.println("Enter two numbers...");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Program started...");
            System.out.println("Answer is : " + num1 / num2);
        } catch (ArithmeticException ae) {
            System.err.println("Diverder not be zero...");
        } catch (InputMismatchException ime) {
            System.err.println("Enter Number Only...");
        } catch (Exception e) {
            System.err.println("Some error Occur...");
        } finally {
            System.out.println("Always executed either Exception came or not...");
        }
        System.out.println("Program Eneded...");

        TryCatch tc = new TryCatch(); // Constructor Called

        Parent p = new Child();
        // p.speak();
    }
}

class MyExcepion extends Exception {
    public MyExcepion(String msg) { // Exception class for handling custom exception...
        super(msg);
    }
}

class Parent {
    public void speak() throws Exception {
        System.out.println("Hello I am Parent...");
    }
}

class Child extends Parent {
    public void speak() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Hello I am Child...");
    }
}

class AtmPin {
    public void pin(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter The Pin in Number Only:");
            int pin = sc.nextInt();
            int correctPin = 123456;
            if(pin != correctPin){
                throw new WrongPinException("WrongPinException");
            }
            System.out.println("Success....");
            
        } catch (WrongPinException wp) {
            try {
                System.out.println("Enter Again the PIN");
                int spin = sc.nextInt();
                int scorrectPin = 123456;
                if(spin != scorrectPin){
                    throw new WrongPinException("WrongPinException");
                }
            System.out.println("Success....");
            }
            catch (Exception swr) {
                    try {
                        System.out.println("Enter The Pin in Number Only:");
                        int pin = sc.nextInt();
                        int correctPin = 123456;
                        if(pin != correctPin){
                           // throw new WrongPinException("WrongPinException");
                        }
                        System.out.println("Success....");
                    }
                    finally{
                        System.out.println("You are Blocked...");
                    }
            }
        }
    }

}

class WrongPinException extends Exception {
    public WrongPinException(String msg) {
        super(msg);
    }
}