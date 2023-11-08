import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumereComplexe a = new NumereComplexe(16,12);
        NumereComplexe b = new NumereComplexe(2,3);
        System.out.println(a.adunare(b));
        System.out.println(a.scadere(b));
        System.out.println(a.scadere(b.inmultireScalar(10)));
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        MatriceComplexa x = new MatriceComplexa(rows,cols);
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
               NumereComplexe v = new NumereComplexe(in.nextInt(),in.nextInt());
               x.matrice[i][j] = v;
            }
        }
        MatriceComplexa y = new MatriceComplexa(rows,cols);
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                NumereComplexe v = new NumereComplexe(in.nextInt(),in.nextInt());
                y.matrice[i][j] = v;
            }
        }
        System.out.println(x.add(y));
        System.out.println(x.sub(y));
    }
}