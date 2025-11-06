public class Main {
    public static void main(String[] args) {
        try {
            methodA();
        } 
        catch (NullPointerException e) {
            System.out.println("Caught in main: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Caught in main: Some other exception occurred.");
        }
    }

    static void methodA() {
        try {
            methodB();
        } 
        catch (NullPointerException e) {
            System.out.println("Caught in methodA: " + e.getMessage());
        }
    }

    static void methodB() {
        try {
            // Uncomment one of these lines to test different cases:
            // int num = Integer.parseInt("abc");  // NumberFormatException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught inside methodB: Invalid number format!");
        }
    }
}
