package practiceproblem;
import java.util.*;
public class guessnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 7; 
        int guess;
        System.out.println("Guess the number between 1 and 10!");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess != secretNumber) {
                System.out.println("Wrong guess, try again!");
            }
        } while (guess != secretNumber);

        System.out.println(" Correct! The secret number is " + secretNumber);
    }
}
