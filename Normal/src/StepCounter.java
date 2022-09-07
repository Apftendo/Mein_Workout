import java.util.Objects;

public class StepCounter {
    private int schrittzähler = 0;
    private int maxSchritte = 0;
   private String datum;
    public StepCounter(String pDatum) {
        this.datum = pDatum;
    }
    public void changeMaxSchritte() {
        if (Objects.equals(datum, "11.11.2011")) {
            maxSchritte = 1111;
        } else {
            maxSchritte = 10000;
        }
    }


    public int incrementSteps() {
        for(int i = 0; i<maxSchritte;i++) {
            schrittzähler++;
        }
        return schrittzähler;
    }
    public String getDatum() {
        return datum;
    }
    public int getSchrittzähler() {
        return schrittzähler;
    }
    public String toString() {
        return "Am "+getDatum()+" bin ich "+getSchrittzähler()+" Schritte gegangen";
    }
}
