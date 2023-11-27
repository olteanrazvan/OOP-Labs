import java.util.Arrays;

public class AltMain {
    public static void main(String[] args){
        Persoana[] lista = new Persoana[5];
        Persoana a1 = new Persoana("paleru","nicu",50);
        Persoana a2 = new Persoana("calota","doru",40);
        Persoana a3 = new Persoana("marin","mihai",35);
        Persoana a4 = new Persoana("babota","marcel",25);
        Persoana a5 = new Persoana("marin","neculae",60);
        lista[0] = a1;
        lista[1] = a2;
        lista[2] = a3;
        lista[3] = a4;
        lista[4] = a5;
        Arrays.sort(lista);
        for(Persoana i:lista){
            System.out.println(i);
        }
    }
}
