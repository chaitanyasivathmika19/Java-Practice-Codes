class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
