package first_package;

public class CounterOutTask implements Task {

    private static int count = 0;

    public CounterOutTask()
    {

    }

    @Override
    public void execute() {
        System.out.println(count);
        count++;
    }
}
