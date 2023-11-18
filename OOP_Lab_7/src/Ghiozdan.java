public class Ghiozdan {
    private Rechizita rechizita[];
    static int nrRechizite;
    public Ghiozdan(int numarRechizite){
        rechizita = new Rechizita[numarRechizite];
    }
    public void add(Caiet c){
        this.rechizita[nrRechizite++] = c;
    }
    public void add(Manual c){
        this.rechizita[nrRechizite++] = c;
    }
    public void listItems(){
        for(int i = 0;i < nrRechizite;i++)
            System.out.println(rechizita[i].getEticheta());
    }
    public void listManual(){
        for(int i = 0;i < nrRechizite;i++){
            if(rechizita[i].getClass() == Manual.class)
                System.out.println(rechizita[i].getEticheta());
        }
    }
    public void listCaiet(){
        for(int i = 0;i < nrRechizite;i++){
            if(rechizita[i].getClass() == Caiet.class)
                System.out.println(rechizita[i].getEticheta());
        }
    }
    public int getNrRechizite(){
        return nrRechizite;
    }
    public int getNrManuale(){
        int j = 0;
        for(int i = 0;i < nrRechizite;i++){
            if(rechizita[i].getClass() == Manual.class) j++;
        }
        return j;
    }
    public int getNrCaiete(){
        int j = 0;
        for(int i = 0;i < nrRechizite;i++){
            if(rechizita[i].getClass() == Caiet.class) j++;
        }
        return j;
    }
}
