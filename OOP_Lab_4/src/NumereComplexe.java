public class NumereComplexe {
    private int  parteReala;
    private int parteImaginara;
    public NumereComplexe(int parteReala,int parteImaginara){
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }
    public NumereComplexe adunare(NumereComplexe b){
        NumereComplexe aux = new NumereComplexe(0,0);
        aux.parteReala = b.parteReala + parteReala;
        aux.parteImaginara = b.parteImaginara + parteImaginara;
        return aux;
        //sau return new NumereComplexe (b.parteReala + parteReala,b.parteImaginara + parteImaginara);
    }
    @Override
    public String toString(){
        if(parteImaginara == 0)
            return Integer.valueOf(parteReala).toString();
        else if(parteImaginara > 0)
            return parteReala + "+" + parteImaginara + "i";
        else
            return parteReala + "" + parteImaginara + "i";
    }
    public NumereComplexe scadere(NumereComplexe b){
        return new NumereComplexe(parteReala - b.parteReala,parteImaginara - b.parteImaginara);
    }

    public NumereComplexe inmultireScalar(int b){
        return new NumereComplexe(parteReala * b,parteImaginara * b);
    }

    public NumereComplexe inmultire(NumereComplexe b){
        return new NumereComplexe(parteReala * b.parteReala - parteImaginara * b.parteImaginara,parteReala * b.parteImaginara + b.parteReala * parteImaginara );
    }
}
