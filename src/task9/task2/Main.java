package task9.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadFirst = new ThreadFirst();
        Thread threadSecond = new ThreadSecond();

        threadFirst.start();
        threadSecond.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(threadFirst.getName());
            threadFirst.join();
            System.out.println(threadSecond.getName());


        }


    }
}

