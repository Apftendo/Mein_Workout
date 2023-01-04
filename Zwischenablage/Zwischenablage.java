package Zwischenablage;

import java.util.Arrays;

public class Zwischenablage {
    private String[] speicher = new String[2];
    private int count =1;
    private int hilfscount =0;
     public void copy(String x) {
         if (speicher [0] == null) {
             speicher[0] = x;
         } else if(speicher [1] == null) {
             speicher[1] = x;
         } else {
             if(count %2==0) {
                 speicher[1] = x;
             } else {
                 speicher[0] =x;
             }
             count++;
         }
     }
     public void paste() {
         if (hilfscount == 0) {
             System.out.println(speicher[1]);
             speicher[1]=null;
             hilfscount++;
         } else if (count %2==0) {
             System.out.println(speicher[0]);
             speicher[0]=null;
         } else {
             System.out.println(speicher[1]);
             speicher[1]=null;
         }
     }
     public String toString() {
         return Arrays.toString(speicher);
     }
}
