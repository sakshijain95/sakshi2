package multithread;

public class ques1 implements Runnable {
    @Override
    public void run() {
        System.out.println("implemented through runnable");

    }


    public static void main(String[] args) {
        new Thread(new ques1()

        ).start();
    }

}
