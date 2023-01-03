package Druckerwarteschlange;

public class PrinterQueue {
    private PrintJob[] jobs;
    private int lenght;
    private int counter;


    public PrinterQueue(int x) {
        jobs = new PrintJob[x];
        lenght = x;
    }
    public void addJob(PrintJob job) {
        for(int i = 0; i<lenght;i++) {
            if( jobs[i] == null) {
                jobs[i] = job;
            }
        }
    }
    public PrintJob nextJob() {
       PrintJob job = jobs[counter];
       counter++;
        return job;
    }


}

