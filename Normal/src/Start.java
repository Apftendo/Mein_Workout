
public class Start {
    public static void main(String[] args) {
        StepCounter s1 = new StepCounter("11.11.2011");
        StepCounter s2 = new StepCounter("1.9.2017");
        s1.changeMaxSchritte();
        s1.incrementSteps();
        System.out.println(s1.toString());
        s2.changeMaxSchritte();
        s2.incrementSteps();
        System.out.println(s2.toString());
    }
}
