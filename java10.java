 class ThreadClassExample extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class RunnableExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadClassExample thread1 = new ThreadClassExample();
        ThreadClassExample thread2 = new ThreadClassExample();

        thread1.start();
        thread2.start();
   try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RunnableExample runnableExample = new RunnableExample();

        Thread thread3 = new Thread(runnableExample);
        Thread thread4 = new Thread(runnableExample);

        thread3.start();
        thread4.start();
    }
}
