package first_package;

public class MyThread extends Thread{
    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(20*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
