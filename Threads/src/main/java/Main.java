public class Main {
    public static void main(String[] args) {
        //FUNDAMENT
        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                Silnia.silnia(5000);
            }
        }); //tworzenie
// lub Thread threadOne = new Thread();
// lub Thread threadOne = new Thread( () -> Silnia.silnia(1000));

        Thread threadTwo = new Thread(() -> Silnia.silnia(6000));
        Thread threadThree = new Thread(() -> Silnia.silnia(4000));
        Thread threadFour = new Thread(() -> Silnia.silnia(3000));
        threadOne.start();//uruchamianie


        long start = System.currentTimeMillis();
        threadTwo.start();
        threadOne.start();
        threadThree.start();
        threadFour.start();

        try {
            threadOne.join();
            //threadTwo.join();
            //threadThree.join();
            //threadFour.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        try {
            //threadOne.join();
            threadTwo.join();
            //threadThree.join();
            //threadFour.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        try {
            //threadOne.join();
            //threadTwo.join();
            threadThree.join();
            //threadFour.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        try {
           // threadOne.join();
           // threadTwo.join();
           // threadThree.join();
            threadFour.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("Finished in: " + (System.currentTimeMillis() - start) + " ms");
    }
}
