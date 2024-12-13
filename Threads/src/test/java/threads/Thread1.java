package threads;

public class Thread1 implements Runnable{

    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("Running threads.Thread1 " + i + " Thread Name-1:: " + Thread.currentThread().getName());
        }
    }
}
