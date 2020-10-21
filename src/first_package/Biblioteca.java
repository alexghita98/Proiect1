package first_package;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Carte> storage;

    public Biblioteca(){
        storage = new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> list)
    {
        storage = new ArrayList<Carte>();
        for(Carte c: list)
        {
            storage.add(c);
        }

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
