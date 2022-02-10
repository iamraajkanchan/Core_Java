package Threads;

public class MainThread {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
        SecondThread secondThread = new SecondThread();
        secondThread.start();
        secondThread.notifyAll();
        ThirdThread thirdThread = new ThirdThread();
        thirdThread.run();
        /*synchronized () {
            try {
                thirdThread.wait();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}
