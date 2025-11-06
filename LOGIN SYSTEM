import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        boolean success = false;

        while (!success) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                login.validate(user, pass);
                System.out.println("Login successful!");
                success = true;
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again.\n");
            }
        }
    }
}

class Login {
    String validUser = "admin";
    String validPass = "1234";

    void validate(String user, String pass) throws InvalidCredentials
