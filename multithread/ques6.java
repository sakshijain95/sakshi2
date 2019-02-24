package multithread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

//public class ques7 {

public class ques6 implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<Future<String>> list = new ArrayList<Future<String>>();

        Callable<String> callable = (Callable<String>) new ques7();
        for (int i = 0; i < 10; i++) {
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for (Future<String> fut : list) {

            //print the return value of Future, notice the output delay in console
            // because Future.get() waits for task to get completed
            System.out.println(new Date() + "::" + fut.get());

            if (fut.isDone()) {

                System.out.println("done");
            } else if (fut.isCancelled()) {
                System.out.println("is cancelled method runs");


            }


            //shut down the executor service now
            executor.shutdownNow();
        }
    }
}