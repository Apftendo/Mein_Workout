package BodyMaxIndex;

public class Health {
    private static double koerperGewicht;
    private static double koerperGroesse;
    private static double koerperBMI;
    private static String gewichtsKlasse;

    public Health(double pGewicht, double pGroesse) {
        this.koerperGewicht = pGewicht;
        this.koerperGroesse = pGroesse;

    }

    public static void computeBMI() {
        koerperBMI = koerperGewicht / (koerperGroesse * koerperGroesse);
    }
    public static void dieseKlasse() {
        if (koerperBMI < 18.5) {
           gewichtsKlasse = "untergewichtig";
        } else if (koerperBMI > 18.5 && koerperBMI <= 25.0) {
           gewichtsKlasse = "normalgewichtig";
        }else if (koerperBMI >= 25.0 && koerperBMI <30.0) {
            gewichtsKlasse = "uebergewichtig";
        } else {
            gewichtsKlasse = "fettleibig";
        }

    }
    public String toString() {
        return "Mit einen BMI von "+koerperBMI+" sind sie "+gewichtsKlasse;
    }
}
