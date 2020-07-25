package Excercises.Excercise1;

import java.time.LocalTime;

public class DecrementingThread extends Thread implements Runnable {
    Counter count;

    public DecrementingThread(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count.decrement();
        }
    }

    @Override
    public void start() {

        System.out.println(LocalTime.now());
        System.out.println(this.getName());

        super.start();
    }
}
