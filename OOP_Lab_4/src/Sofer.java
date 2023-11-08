public class Sofer {
    private String nume;
    private int varsta;
    private String nrPermis;

    public int getVarsta() {
        return varsta;
    }

    public String getNrPermis() {
        return nrPermis;
    }

    public String getNume() {
        return nume;
    }

    public Sofer(String nume, int varsta, String nrPermis){
        this.nume = nume;
        this.varsta = varsta;
        this.nrPermis = nrPermis;
    }
}
