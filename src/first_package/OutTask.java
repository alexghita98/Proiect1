package first_package;

public class OutTask implements Task {
    private String message;

    public OutTask(String msg){
        this.message = msg;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
