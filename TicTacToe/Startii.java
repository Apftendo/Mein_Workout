package TicTacToe;

public class Startii {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.setMark(1,1);
        t.setMark(1,2);
        t.setMark(0,0);
        t.setMark(0,1);
        t.setMark(2,2);
        System.out.println(t.toString());
    }
}
