package first_package;

/**
 * Modeleaza un obiect de tip carte
 *
 * <p>Cartea va face parte dintr-o biblioteca</p>
 *
 * @see Biblioteca
 * @author andrei.ghita
 */

public class Carte implements Comparable<Carte>{
    /**
     * Titlu cartii ar trebui sa fie un string de maxim 30 de caractere
     */
    private String titlu;
    private String autor;
    private int an_aparitie;
    private int nr_pag;

    public Carte(String t, String a, int an, int npag)
    {
        this.titlu = t;
        this.autor = a;
        this.an_aparitie = an;
        this.nr_pag = npag;
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de " + this.autor + " publicata in " + this.an_aparitie;
    }

    /**
     * Compara obiectul curent cu cel dat ca <b>parametru</b>
     * @param o obiectul cu care se compara
     * @return intoarce 1 daca this > o, 0 altfel
     */

    @Override
    public int compareTo(Carte o) {
        if(this.nr_pag > o.nr_pag)
        {
            return 1;
        }
        else if(this.nr_pag < o.nr_pag)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
