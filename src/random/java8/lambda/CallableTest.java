package random.java8.lambda;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        Runnable arunner = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside a thread");
        };
        Callable<Integer> aCaller = () -> {
            return new Random().nextInt();
        };
        FutureTask<Integer> futureTask=new FutureTask<Integer>(aCaller);
        

    }
}
