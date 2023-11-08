public class NumereComplexe {
    int parteReala;
    int parteImaginara;

    public int getParteImaginara() {
        return parteImaginara;
    }

    public int getParteReala() {
        return parteReala;
    }
    public void setParteImaginara(int parteImaginara) {
        this.parteImaginara = parteImaginara;
    }

    public void setParteReala(int parteReala) {
        this.parteReala = parteReala;
    }
    public NumereComplexe(int parteReala,int parteImaginara){
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }
    public NumereComplexe adunare(NumereComplexe a){
        return new NumereComplexe(parteReala + a.parteReala,a.parteImaginara + parteImaginara);
    }
    public NumereComplexe scadere(NumereComplexe a){
        return new NumereComplexe(parteReala - a.parteReala,parteImaginara - a.parteImaginara);
    }
    public NumereComplexe inmultireScalar(int a){
        return new NumereComplexe(parteReala * a,parteImaginara * a);
    }

    @Override
    public String toString(){
        if(parteImaginara == 0){
            return parteReala + "";
        }
        else
            if(parteImaginara > 0)
                return parteReala + "+" + parteImaginara + "i";
            else
                return parteReala + "" + parteImaginara + "i";
    }

}
