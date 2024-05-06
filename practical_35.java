class HelloThread extends Thread {
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class WorldThread extends Thread {
    public void run() {
        for (int j=0;j<=5;j++) {
            System.out.println("World");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class practical_35 {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        WorldThread worldThread = new WorldThread();
        helloThread.start();
        worldThread.start();
    }
}
