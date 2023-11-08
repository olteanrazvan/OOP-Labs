import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private Sofer sofer;
    private int vitezaCurenta;
    private int vitezaMaxima;
    private int treaptaCurenta = 1;
    private int treaptaMaxima;
    private int rezervor;
    private int CapacitateRezervor;

    public Color getCuloare() {
        return culoare;
    }
    public int getTreaptaCurenta() {
        return treaptaCurenta;
    }
    public int getTreaptaMaxima() {
        return treaptaMaxima;
    }
    public int getVitezaCurenta() {
        return vitezaCurenta;
    }
    public int getVitezaMaxima() {
        return vitezaMaxima;
    }
    public Sofer getSofer() {
        return sofer;
    }
    public String getMarca() {
        return marca;
    }

    public int getRezervor() {
        return rezervor;
    }

    public int getCapacitateRezervor() {
        return CapacitateRezervor;
    }

    public void setCapacitateRezervor(int capacitateRezervor) {
        CapacitateRezervor = capacitateRezervor;
    }

    public void setRezervor(int rezervor) {
        this.rezervor = rezervor;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }
    public void setTreaptaCurenta(int treaptaCurenta) {
        this.treaptaCurenta = treaptaCurenta;
    }
    public void setTreaptaMaxima(int treaptaMaxima) {
        this.treaptaMaxima = treaptaMaxima;
    }
    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }
    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
    public Autovehicul(String marca,Color culoare,Sofer sofer,int vitezaMaxima,int treaptaMaxima,int capacitateRezervor){
        this.marca = marca;
        this.culoare = culoare;
        this.sofer = sofer;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaMaxima = treaptaMaxima;
        this.CapacitateRezervor = capacitateRezervor;
    }
    public int accelerare(int delta){
        if(vitezaCurenta + delta < vitezaMaxima)
            vitezaCurenta += delta;
        else
            vitezaCurenta = vitezaMaxima;
        return vitezaCurenta;
    }
    public int decelerare(int delta){
        if(vitezaCurenta - delta > 0)
            vitezaCurenta -= delta;
        else
            vitezaCurenta = 0;
        return vitezaCurenta;
    }
    public int treaptaSuperioara(int delta){
        if(treaptaCurenta + delta < treaptaMaxima)
            treaptaCurenta += delta;
        else
            treaptaCurenta = treaptaMaxima;
        return treaptaCurenta;
    }
    public int treaptaInferioara(int delta){
        if(treaptaCurenta - delta > 1)
            treaptaCurenta -= delta;
        else
            treaptaCurenta = 1;
        return treaptaCurenta;
    }
    public int plinRezervor(int delta){
        if(rezervor + delta < CapacitateRezervor)
            rezervor += delta;
        else
            rezervor = CapacitateRezervor;
        return rezervor;
    }
    public int utilizareRezervor(int delta){
        if(rezervor - delta > 0)
            rezervor -= delta;
        else
            rezervor = 0;
        return rezervor;
    }

    @Override
    public String toString(){
        return "Soferul " + sofer.getNume() + " de varsta de " + sofer.getVarsta() + " de ani cu permis de categoria " + sofer.getNrPermis()
                + " detine o masina de marca " + getMarca() + ", are o viteza de "
                + getVitezaCurenta() +"km/h in treapta " + getTreaptaCurenta() + " si mai are " + getRezervor() + "L in rezervor";
    }
}
