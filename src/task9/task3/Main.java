package task9.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        Buffer buffer = new Buffer();

        producer.run();
        producer.start();
        consumer.run();
        consumer.start();


        for (int z = 0; z < 50; z++) {



        for (int k = 0; k < buffer.getBuffer().length; k++) {
            if (buffer.getBuffer()[k] == 0) {


                buffer.setBuffer(producer.setCount());
                for (int i = 0; i < buffer.getBuffer().length; i++) {


                }
            }
            else
                {
                consumer.join();
            }
        }
        consumer.arrayList = buffer.getBuffer();
        consumer.getCount();
    }

    }
}
