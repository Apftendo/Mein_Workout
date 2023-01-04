package Zwischenablage;

public class Srtaterr {
    public static void main(String[] args) {
        Zwischenablage s = new Zwischenablage();
        s.copy("a");
        s.copy("b");
        s.paste();
        s.copy("q");
        System.out.println(s);
    }
}
