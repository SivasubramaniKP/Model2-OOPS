public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("New Thread");
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("Counter ="+ i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Execution finished");
    }
    
}
