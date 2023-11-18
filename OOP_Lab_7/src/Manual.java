public class Manual extends Rechizita{
    public Manual(String nume){
        this.eticheta = nume;
    }
    @Override
    public String getEticheta(){
        return "Manual " + this.eticheta;
    }
}
