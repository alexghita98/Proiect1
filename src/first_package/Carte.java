package first_package;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private int an_aparitie;
    private int numar_pagini;

    public Carte(String t, String a, int an, int npag)
    {
        this.titlu = t;
        this.autor = a;
        this.an_aparitie = an;
        this.numar_pagini = npag;
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de " + this.autor + " publicata in " + this.an_aparitie;
    }

    @Override
    public int compareTo(Carte o) {
        if(this.numar_pagini > o.numar_pagini)
        {
            return 1;
        }
        else if(this.numar_pagini < o.numar_pagini)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
