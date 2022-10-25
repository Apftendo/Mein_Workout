package Fernbedienung;

public class Fernsehsender {
    String[] sender;
    Fernsehsender() {
       sender = new String[]{"a", "b", "c", "d", "e"};
    }
    public String[] getFernsehsender() {
        return sender;
    }
}
