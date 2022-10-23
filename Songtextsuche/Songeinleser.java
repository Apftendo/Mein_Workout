package Songtextsuche;

import java.util.Scanner;

public class Songeinleser {

    static Scanner scanner = new Scanner(System.in);
    private static String urlTeil1 = "http://lyrics.wikia.com/api.php?func=getSong&artist=";
    private static String urlTeil2 = "&song=";

    private static void einlesen() {
        System.out.println("Name des Künstler angeben:");
        String kuenstler = scanner.nextLine();
        System.out.println("Name des Songs angeben:");
        String song = scanner.nextLine();
        System.out.println(urlTeil1 + kuenstler.replaceAll(" ", "_").toLowerCase() + urlTeil2 + song.toLowerCase());

    }

    public static void main(String[] args) {
        einlesen();
    }

}
