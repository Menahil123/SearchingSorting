import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class RockPaperScissors {
    private static final String[] CHOICES = {"rock", "paper", "scissors"};
    private static final Set<String> VALID_CHOICES = new HashSet<>(Set.of(CHOICES));
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int userScore = 0;
        int computerScore = 0;

        while (true) {
            String userChoice = getUserChoice();
            String computerChoice = getComputerChoice();

            System.out.println("\nYou chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            if (result.contains("win")) {
                userScore++;
            } else if (result.contains("lose")) {
                computerScore++;
            }

            System.out.println("Score - You: " + userScore + ", Computer: " + computerScore);

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        System.out.println("Thank you for playing!");
    }

    private static String getUserChoice() {
        String choice;
        while (true) {
            System.out.print("Enter rock, paper, or scissors: ");
            choice = scanner.nextLine().trim().toLowerCase();
            if (VALID_CHOICES.contains(choice)) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        return choice;
    }

    private static String getComputerChoice() {
        int index = random.nextInt(CHOICES.length);
        return CHOICES[index];
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "You win!" : "You lose!";
            case "paper":
                return (computerChoice.equals("rock")) ? "You win!" : "You lose!";
            case "scissors":
                return (computerChoice.equals("paper")) ? "You win!" : "You lose!";
            default:
                throw new IllegalStateException("Unexpected value: " + userChoice);
        }
    }
}
