public class Persoana implements Comparable {
    private String nume;
    private String prenume;
    private int varsta;

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public Persoana(String nume,String prenume,int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public int compareTo(Object o){
        Persoana rez = (Persoana) o;
        if(this.nume.equals(rez.nume))
            return this.prenume.compareTo(rez.prenume);
        else
            return this.nume.compareTo(rez.nume);
    }
    public String toString(){
        return "Persoana " + nume + " " + prenume + " cu varsta de " + varsta + " de ani";
    }
}
