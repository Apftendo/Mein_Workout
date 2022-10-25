package Fernbedienung;

import java.util.Arrays;
import java.util.Scanner;

public class Bedienung {
    Scanner s = new Scanner(System.in);
    private String[] meineSender;
    private int aktuellerSender;
    Fernsehsender f1 = new Fernsehsender();
    public int schalteUm(int x) {
        meineSender = f1.getFernsehsender();
        aktuellerSender = x;
        this.aktuellerSender = this.aktuellerSender+1;
        System.out.println(meineSender[aktuellerSender]);
        if(aktuellerSender > meineSender.length) {
            aktuellerSender = 0;
        }

        System.out.println("");
        return aktuellerSender;
    }

    public static void main(String[] args) {
        Bedienung b = new Bedienung();
        b.menue();

    }
    public void zeigeSender(int x) {
        meineSender = f1.getFernsehsender();
        aktuellerSender = x;
        System.out.println(meineSender[aktuellerSender]);
    }
    public void menue() {
        System.out.println("Möchtest du Sender anzeigen(1) oder ändern(2)?");
        String antwort44 = s.nextLine();
        Bedienung b44 = new Bedienung();
        if (antwort44.equals("1")) {
            b44.zeigeSender(aktuellerSender);
            b44.menue();
        } else if (antwort44.equals("2")) {
            b44.schalteUm(aktuellerSender);
            b44.menue();
        } else {
            System.out.println("Bitte gib eine Nummer ein");
            b44.menue();
        }
        b44.menue();
    }

}
