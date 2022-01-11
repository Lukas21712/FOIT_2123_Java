package v_schleifen.v_xxxx;

import java.util.Scanner;

public class Galgenmaenchen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = "test";
        String eingabe = null;
        int length = word.length();
        
        for (int counter = 0; counter != length; counter ++) {
            System.out.print("_ ");
        }

        while (!eingabe.equals(word)) {
            System.out.println("Bitte geben Sie einen Buchstaben ein: ");
            eingabe = input.next();
        }

        if (eingabe.equals(word)) {
            System.out.println("Sie haben das richtige Wort erraten");
        }
    }
}
