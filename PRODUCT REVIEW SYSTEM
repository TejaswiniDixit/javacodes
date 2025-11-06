import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReviewSystem review = new ReviewSystem();

        System.out.print("Enter product rating (1 to 5): ");
        int rating = sc.nextInt();
        sc.nextLine(); // to consume newline

        System.out.print("Enter your comment: ");
        String comment = sc.nextLine();

        try {
            review.submitReview(rating, comment);
            System.out.println("Review submitted successfully!");
        } 
        catch (InvalidRatingException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (EmptyReviewException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class ReviewSystem {
    void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5.");
        }
        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Review comment cannot be empty.");
        }
        System.out.println("Rating: " + rating + " ★");
        System.out.println("Comment: " + comment);
    }
}

class InvalidRatingException extends Exception {
    InvalidRatingException(String msg) {
        super(msg);
    }
}

class EmptyReviewException extends Exception {
    EmptyReviewException(String msg) {
        super(msg);
    }
}
