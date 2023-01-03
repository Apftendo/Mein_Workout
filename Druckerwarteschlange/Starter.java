package Druckerwarteschlange;

public class Starter {
    public static void main(String[] args) {
        PrinterQueue q = new PrinterQueue(2);
        q.addJob(new PrintJob("Blat"));

    }
}
