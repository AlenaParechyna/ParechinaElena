package task9.task3;


import java.util.Random;

import task9.task3.Buffer;
import task9.task3.*;

public class Producer extends Thread {


    public Integer setInt() {
        int i = (int) (1 + (Math.random() * 10));
        return i;


    }


    public int[] setCount() {
        int[] bufferIn = new Buffer().getBuffer();
        for (int k = 0; k < bufferIn.length; k++) {
            bufferIn[k] = setInt();
        }
        for (int a = 0; a < bufferIn.length; a++) {
            System.out.println(bufferIn[a]);

        }
        return bufferIn;
    }
}

