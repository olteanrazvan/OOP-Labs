public class Caiet extends Rechizita{
    public Caiet(String nume){
        this.eticheta = nume;
    }
    @Override
    public String getEticheta(){
        return "Caiet " + this.eticheta;
    }
}
