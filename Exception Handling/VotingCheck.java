import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class VotingCheck {
    public static void main(String[] args) throws InvalidAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    
}
