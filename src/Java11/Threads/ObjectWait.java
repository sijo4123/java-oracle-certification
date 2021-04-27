package Java11.Threads;

public class ObjectWait {

    public static void main(String[] args) throws InterruptedException {
        waitForSignal();
    }

    static void waitForSignal() throws InterruptedException {
        Object obj = new Object();
        synchronized (Thread.currentThread()) {
            obj.wait();
            obj.notify();
        }
    }
}
