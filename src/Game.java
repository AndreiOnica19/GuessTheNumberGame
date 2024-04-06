import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int lives = 8;

        while (true) {
            System.out.println("Guess a number between 1 and 100!");
            int guessedNumber = sc.nextInt();
            counter++;
            if (lives == 0){
                System.out.println("Game over!");
                break;
            }
            if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
                lives--;
            } else if (guessedNumber < hiddenNumber) {
                System.out.println("More");
                lives--;
            } else {
                System.out.println("You guessed! You used " + counter + " attempts.");
                break;
            }
        }
    }
}
