package v_schleifen.v_xxxx;

import java.util.Scanner;

public class Galgenmaenchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lives = 8;
        String[] words = new String[] { "Praktikum", "Wirtschaftsinformatik", "Bahnsteig", "Java", "Computer" };
        String randomWord = words[(int) (Math.random() * words.length)];
        char[] letters = new char[randomWord.length()];

        System.out.println("Game startet");
        System.out.println("Das Word hat " + randomWord.length() + " Buchstaben.");

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

        while (lives > 0) {
            System.out.print("Versuche: ");

            for (int i = 0; i < lives; i++) {
                System.out.print("❤");
            }

            System.out.println();
            System.out.println("Eingabe: ");

            String input = scanner.nextLine();

            char letter = input.charAt(0);
            boolean isGuessCorrect = false;

            for (int i = 0; i < randomWord.length(); i++) {
                char l = randomWord.charAt(i);

                if (l == letter) {
                    letters[i] = l;
                    isGuessCorrect = true;
                }
            }

            if (!isGuessCorrect) {
                lives = lives - 1;
            }

            boolean isGameFinished = true;

            System.out.print("Wort: ");

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == '_') {
                    isGameFinished = false;
                }

                System.out.print(letters[i]);
            }

            System.out.println();
            System.out.println("--------------------------");

            if (isGameFinished) {
                System.out.println("Du hast gewonnen");
                break;
            }
        }

        if (lives == 0) {
            System.out.println("Du hast verloren! Das Word war: " + randomWord);
        }
    }
}
