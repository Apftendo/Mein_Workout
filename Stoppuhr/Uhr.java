package Stoppuhr;

import java.util.Scanner;

public class Uhr {
    public static void main(String[] args) throws Exception {
        Timer t = new Timer(0,0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Willst du starten? (musst du sowieso)");
        String antwort = sc.nextLine();
        t.start();
        Thread.sleep(3000);
        t.stop();

    }
}
