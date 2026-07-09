class MyThread extends Thread {
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
    }
public class thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        }
    }
}