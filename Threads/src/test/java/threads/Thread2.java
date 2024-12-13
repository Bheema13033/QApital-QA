package threads;

public class Thread2 implements Runnable{
public void run(){
    for(int i=0;i<=20;i++){
        System.out.println("Running threads.Thread2 "+i+ " Thread Name-2:: "+Thread.currentThread().getName());

    }
}

}
