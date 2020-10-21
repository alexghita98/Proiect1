package first_package;

import java.util.Random;

public class RandomOutTask implements Task {

    private int randomized;

    public RandomOutTask(){
        Random rand = new Random();

        randomized = rand.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(randomized);
    }
}
