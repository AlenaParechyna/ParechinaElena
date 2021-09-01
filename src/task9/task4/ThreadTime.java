package task9.task4;

import java.time.LocalDateTime;
import java.util.Date;


public class ThreadTime extends Thread{


    long i = 10000;


    public ThreadTime(long i) {
        this.i = i;
    }

    public void showTime() {
    Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date date = new Date();

            System.out.println(date.toString());
        }

    }

    }

