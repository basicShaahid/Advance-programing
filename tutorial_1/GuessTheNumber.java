import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int magicNumber = random.nextInt(101); // Generates a number between 0 and 100
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Guess a magic number between 0 and 100");
            
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                
                if (guess < 0 || guess > 100) {
                    System.out.println("Please enter a number between 0 and 100.");
                    continue;
                }
                
                if (guess < magicNumber) {
                    System.out.println("Your guess is too low");
                } else if (guess > magicNumber) {
                    System.out.println("Your guess is too high");
                } else {
                    System.out.println("Yes, the number is " + magicNumber);
                    break;
                }
            }
        }
    }
}
