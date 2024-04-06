import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int hiddenNumber = 88;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Guess a number between 1 and 100!");
            int guessedNumber = sc.nextInt();
            if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
            } else if (guessedNumber < hiddenNumber) {
                System.out.println("More");
            } else {
                System.out.println("You guessed!");
                break;
            }
        }
    }
}
