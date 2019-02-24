package multithread;

public class ques1second extends Thread{

    @Override
    public void run() {
        System.out.println("Extended through thread");
    }

    public static void main(String[] args) {
        new ques1second().start();
    }
}
