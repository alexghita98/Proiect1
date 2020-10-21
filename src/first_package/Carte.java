package first_package;

public class Carte implements Comparable<Carte>{
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
