package Threads;

public class SecondThread extends Thread {
    @Override
    public void run() {
        super.run();
        this.setName("Firefox");
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(this.getName() + " " + i);
        }
        try {
            sleep(2000);
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
