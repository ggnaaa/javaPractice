package practice.extra;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"elephant", "giraffe", "kangaroo", "panda", "tiger", "zebra", "dolphin", "shark", "whale", "penguin",
                "lion", "leopard", "crocodile", "koala", "bear", "wolf", "rabbit", "cheetah", "otter", "hippopotamus",
                "parrot", "eagle", "owl", "sparrow", "flamingo", "peacock", "robin", "cardinal", "canary", "pigeon",
                "vulture", "crow", "hawk", "bat", "seagull", "turkey", "woodpecker", "duck", "goose", "pheasant",
                "rose", "tulip", "sunflower", "daisy", "lily", "orchid", "violet", "lavender", "daffodil", "marigold",
                "cherryblossom", "poppy", "magnolia", "iris", "geranium", "camellia"};
        String word = words[(int) (Math.random() * words.length)];
        StringBuilder hiddenWord = new StringBuilder("_".repeat(word.length()));
        int attemptsLeft = 10;

        System.out.println("Welcome to Hangman!");

        while (attemptsLeft > 0) {
            System.out.println("Current word: " + hiddenWord);
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess && hiddenWord.charAt(i) == '_') {
                    hiddenWord.setCharAt(i, guess);
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attemptsLeft--;
                System.out.println("Wrong guess!");
            }

            if (hiddenWord.toString().equals(word)) {
                System.out.println("Congratulations! You've guessed the word: " + word);
                break;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("Game over! The word was: " + word);
        }

        scanner.close();
    }
}
