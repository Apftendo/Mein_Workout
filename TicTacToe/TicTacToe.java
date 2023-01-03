package TicTacToe;


import java.util.Arrays;

public class TicTacToe {
    public int[][] spielfeld = new int[3][3];
    private int mark =1;
    public TicTacToe() {
        reset();
        toString();
    }
    public void reset() {
        for (int i = 0; i<3; i++) {
            for (int j =0; j<3;j++) {
                spielfeld[i][j]=0;
            }
        }
    }
    public String toString() {
        String s = "";
        for(int i =0; i< spielfeld.length;i++) {
            for(int j = 0;j< spielfeld.length;j++) {
                s = switch (spielfeld[i][j]) {
                    case 0 -> s + " ";
                    case 1 -> s + "X";
                    case 2 -> s + "0";
                    default -> s + " ";
                };
                if ((j+1)%3!=0) {
                    s = s+"|";
                }
                if((j+1)%3==0&&i<2) {
                    s = s+"\n";
                    s=s+"-+-+-";
                    s=s+"\n";
                }
            }
        }

        return s;
    }
    public void setMark(int x, int y) {
        if(mark%2==0) {
            spielfeld[x][y] = 2;
        } else {
            spielfeld[x][y]=1;
        }
        mark++;
    }
}
