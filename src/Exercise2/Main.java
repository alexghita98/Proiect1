package Exercise2;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        threads[0] = new Thread("1");
        threads[1] = new Thread("2");
        threads[2] = new Thread("3");
        threads[3] = new Thread("4");
        threads[4] = new Thread("5");
        threads[5] = new Thread("6");
        threads[6] = new Thread("7");
        threads[7] = new Thread("8");
        threads[8] = new Thread("9");
        threads[9] = new Thread("10");

        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<threads.length;i++)
        {
            threads[i].start();
            System.out.println(threads[i].getName());
        }
    }
}
