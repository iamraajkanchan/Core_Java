package InterruptThread;

public class InterruptThreadMain extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(currentThread() + " " + i);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println(currentThread() + " throws the exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InterruptThreadMain interruptThreadMain = new InterruptThreadMain();
        interruptThreadMain.start();
        interruptThreadMain.interrupt();

        Thread anonymousThread = new Thread(() -> {
            try {
                for (int j = 0; j < 10; j++) {
                    System.out.println(currentThread() + " " + j);
                    // Thread.sleep(2000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        anonymousThread.start();
        anonymousThread.interrupt();
    }
}
