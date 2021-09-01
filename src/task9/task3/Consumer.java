package task9.task3;

import java.util.ArrayList;

import task9.task3.*;

public class Consumer extends Thread {

    int[] arrayList = new int[10];
    ArrayList<Integer>countDump = new ArrayList<>();

    public void getCount() {
        for (int i = 0; i < arrayList.length; i++) {
           countDump.add(arrayList[i]);
           arrayList[i]=0;


        }
        System.out.println(countDump);

    }
}





