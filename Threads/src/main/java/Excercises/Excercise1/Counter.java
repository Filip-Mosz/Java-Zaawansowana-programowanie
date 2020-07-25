package Excercises.Excercise1;

public class Counter {
    public int count;

    public Counter() {}

    public Counter(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Counter{" + count + "}";
    }

    public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
         count--;
    }
}
