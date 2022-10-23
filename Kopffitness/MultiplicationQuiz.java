package Kopffitness;
import java.util.Random;

public class MultiplicationQuiz {
    private String meineAufgabe;
    private int meinErgebnis;
    Random random = new Random();
    private int upperbound = 21;
    public MultiplicationQuiz(){
        generateQuiz();
    }
    private void generateQuiz() {
        int a = random.nextInt(upperbound);
        int b = random.nextInt(upperbound);
        meineAufgabe = a+"*"+b+" = ?";
        meinErgebnis = a*b;
    }
    public void getExercise() {
        System.out.println(meineAufgabe);
    }
    public void getResult() {
        System.out.println("Result: "+meinErgebnis);
    }
}
