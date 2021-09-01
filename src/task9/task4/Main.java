package task9.task4;

public class Main {
    public static void main(String[] args) {

        ThreadTime threadTime = new ThreadTime(10000);

        threadTime.start();
        threadTime.showTime();

    }
}
