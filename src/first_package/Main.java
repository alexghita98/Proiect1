package first_package;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Carte c = new Carte("Ion", "Liviu Rebreanu", 1920, 500);
        Carte c1 = new Carte("Ion", "Liviu Rebreanu", 1920, 400);
        Biblioteca b = new Biblioteca();
        b.addCarte(c);
        b.addCarte(new Carte("1", "2", 3, 4));
        System.out.println(c.compareTo(c1));*/

        /*ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask("mesaj1"));
        tasks.add(new OutTask(",mesaj2"));
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());
        tasks.add(new CounterOutTask());

    //yeaaaa

        for(Task j:tasks)
            j.execute();
                    */

        /*Thread[] threads = new Thread[10];

        threads[0] = new MyThread();
        threads[1] = new MyThread();
        threads[2] = new MyThread();
        threads[3] = new MyThread();
        threads[4] = new MyThread();
        threads[5] = new MyThread();
        threads[6] = new MyThread();
        threads[7] = new MyThread();
        threads[8] = new MyThread();
        threads[9] = new MyThread();

        for(int i=0;i<threads.length;i++)
        {
            threads[i].start();
        }

        for(int i=0;i<threads.length;i++)
        {
            threads[i].join();
        }*/

        personalThread pT = new personalThread();
        pT.start();
        personalRunnable pR = new personalRunnable();
        pR.run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Right on!");;
            }
        }).start();

        pT.join();


    }
}
