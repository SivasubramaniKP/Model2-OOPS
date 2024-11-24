public class ThreadDemo {
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        thread1.start();
        thread2.start();
    }
    
}
