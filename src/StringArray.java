import java.util.Scanner;
import java.util.ArrayList;

public class StringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> StringCases = new ArrayList<String>();
        int anzahl;
        int auswahl;

        System.out.println("Wie viele Sätze willst du speichern?");
        anzahl = input.nextInt();

        for (int i = 0; i < anzahl; i++) {
            System.out.println("Bitte geben Sie einen Satz ein:");
            StringCases.add(input.next());
        }

        System.out.println("---------------------------------------");
        System.out.println("1: Nur das erste Wort");
        System.out.println("2: Vokale tauschen");
        System.out.println("3: Länge des Satzes");
        System.out.println("4: Alles klein schreiben");
        System.out.println("5: Alles groß schreiben");
        System.out.println("6: Wörter trennen");
        System.out.println("7: Gibt den Index ");
        System.out.println("8: equals");
        System.out.println("9: LastIndexof");
        System.out.println("Bitte geben Sie einen Index ein:");
        auswahl = input.nextInt();
    }
}
