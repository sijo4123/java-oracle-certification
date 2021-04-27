package Java11.Threads;

class PingPong {
    synchronized void hit(long n) {
        for(int i = 1; i < 3; i++)
            System.out.print(n + "-" + i + " ");
    }
}
class Tester implements Runnable {
    static PingPong pp2 = new PingPong();

    public static void main(String[] args) {
        new Thread(new Tester()).start();
        new Thread(new Tester()).start();
    }

    public void run() {
        pp2.hit(Thread.currentThread().getId());
    }
}