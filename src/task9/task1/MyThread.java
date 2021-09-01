package task9.task1;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class MyThread extends Thread implements Runnable   {

    public Object object = new Object();

    public void run() {
        // System.out.println("Thread " + getName()+ " is progress");
        try {

            synchronized (this) {

                wait(100);

            }

        } catch (InterruptedException e) {

            System.err.print("ошибка потока");

        }

    }



    public synchronized void makeAnything() throws IOException {
        try {
            wait(1000);

        }catch (InterruptedException e)  {
            e.printStackTrace();
        }

        //System.out.println("Press any key");
        //char c = (char)System.in.read();

    }

    public void doSomething(   ){
        synchronized (object){

        }
    }
}

