package Threads;

public class FirstThread extends Thread {
    @Override
    public void run() {
        super.run();
        this.setName("Google Chrome");
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(this.getName() + " "+ i);
        }
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
