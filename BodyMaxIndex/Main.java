package BodyMaxIndex;

public class Main {
    public static void main(String[] args) {
        Health a = new Health(57.0,1.80);
        a.computeBMI();
        a.dieseKlasse();
        System.out.println(a.toString());
        Health b = new Health(81.0,1.80);
        b.computeBMI();
        b.dieseKlasse();
        System.out.println(b.toString());
        Health c = new Health(120,2.00);
        c.computeBMI();
        c.dieseKlasse();
        System.out.println(c.toString());
    }
}
