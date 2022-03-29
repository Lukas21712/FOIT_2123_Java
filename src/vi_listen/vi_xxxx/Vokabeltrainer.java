package vi_listen.vi_xxxx;

import java.util.*;
import java.io.*;

public class Vokabeltrainer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> deutsch = new ArrayList<String>();
        ArrayList<String> englisch = new ArrayList<String>();

        int menu;
        int punkte;

        System.out.println("Willkommen in deinem Vokabeltrainer!");
        System.out.println("1. Wortepaar erstellen: ");
        System.out.println("2. Wortepaare anzeigen: ");
        System.out.println("3. Wortepaar abfrage: ");
        System.out.println("4. Vokabeltrainer beenden: ");
        System.out.println("Bitte gibt eine Zahl ein: ");
        menu = input.nextInt();

        while (menu != 4) {
            if (menu == 1) {
                System.out.println("------------------------------");
                System.out.println("Bitte gibt eine deutsches Wort an: ");
                deutsch.add(input.next());
                listDeutsch(deutsch, new File("/FOIT_2123/FOIT_2123_Java/src/vi_listen/vi_xxxx/deutsch.txt"));
                System.out.println("Bitte gibt nun die englische Übersetzung an: ");
                englisch.add(input.next());
                listEnglisch(englisch, new File("/FOIT_2123/FOIT_2123_Java/src/vi_listen/vi_xxxx/englisch.txt"));
            } else if (menu == 2) {

            } else if (menu == 3) {
                if (deutsch.isEmpty()) {
                    System.out.println("------------------------------");
                    System.out.println("Kein Wortepaar vorhanden!");
                } else {
                    for (int i = 0; i != deutsch.size(); i++) {
                        System.out.println("Original: ");
                        System.out.println(deutsch.get(i));
                    }
                }
                if (englisch.isEmpty()) {
                    System.out.println("Keine Englische Übersetzung vorhanden!");
                } else {
                    for (int i = 0; i != englisch.size(); i++) {
                        System.out.println("Übersetung: ");
                        System.out.println(englisch.get(i));
                    }
                }
            }
            System.out.println("------------------------------");
            System.out.println("1. Wortepaar erstellen: ");
            System.out.println("2. Wortepaare anzeigen: ");
            System.out.println("3. Wortepaar abfrage: ");
            System.out.println("4. Vokabeltrainer beenden: ");
            System.out.println("Bitte gibt eine Zahl ein: ");
            menu = input.nextInt();
        }
    }

    private static void listDeutsch(List list, File datei){
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(datei));
            Iterator iter = list.iterator();
            while(iter.hasNext() ) {
                Object o = iter.next();
                printWriter.println(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(printWriter != null) printWriter.close();
        }
    }

    private static void listEnglisch(List list, File datei){
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(datei));
            Iterator iter = list.iterator();
            while(iter.hasNext() ) {
                Object o = iter.next();
                printWriter.println(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(printWriter != null) printWriter.close();
        }
    }
}
