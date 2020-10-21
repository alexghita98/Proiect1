package first_package;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Carte> storage;

    public Biblioteca(){
        storage = new ArrayList<Carte>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Carte c:storage){
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }

    public void addCarte(Carte c)
    {
        storage.add(c);
    }
}
