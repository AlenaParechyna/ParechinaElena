package task9.task1;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {


            Thread thread1 = new MyThread();
            System.out.println(thread1.getState());//NEW
            thread1.start();
            System.out.println(thread1.getState());//RUNNABLE
            Thread thread2 = new Thread();
            thread2.start();


            try {
                synchronized (thread2) {
                    Thread.sleep(10);
                    System.out.println(thread2.getState());//BLOCKED
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            Thread thread3 = new MyThread();
            thread3.start();
            Thread.sleep(20);
            System.out.println(thread3.getState());//TIMED_WAITING

            System.out.println(thread2.getState());//TERMINATED









    }


}




