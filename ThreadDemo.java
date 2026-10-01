public class ThreadDemo {

    // 1) Creating threads by extending Thread class
    static class GoodMorningThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Good Morning thread interrupted.");
                    return;
                }
            }
        }
    }

    static class HelloThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Hello thread interrupted.");
                    return;
                }
            }
        }
    }

    static class WelcomeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Welcome thread interrupted.");
                    return;
                }
            }
        }
    }

    // 2) Repeating the same by implementing Runnable
    static class GoodMorningRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Runnable Good Morning thread interrupted.");
                    return;
                }
            }
        }
    }

    static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Runnable Hello thread interrupted.");
                    return;
                }
            }
        }
    }

    static class WelcomeRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Runnable Welcome thread interrupted.");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Thread class example
        Thread t1 = new GoodMorningThread();
        Thread t2 = new HelloThread();
        Thread t3 = new WelcomeThread();

        t1.start();
        t2.start();
        t3.start();

        // Runnable example
        Thread r1 = new Thread(new GoodMorningRunnable());
        Thread r2 = new Thread(new HelloRunnable());
        Thread r3 = new Thread(new WelcomeRunnable());

        r1.start();
        r2.start();
        r3.start();
    }
}
