package exercises;

import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
    }

    public StopWatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
     public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start(){
        return startTime = System.currentTimeMillis();
    }
    public long end(){
        return endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch sw = new StopWatch();
        long startTime, endTime;
        startTime = sw.start();
        for(long i = 0; i < 100000; i++){
        }
        endTime = sw.end();

        System.out.print("Elapsed time is: " + sw.getElapsedTime());
    }
}
