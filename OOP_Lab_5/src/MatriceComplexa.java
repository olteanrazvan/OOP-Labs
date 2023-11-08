public class MatriceComplexa {
    NumereComplexe[][] matrice;
    public MatriceComplexa(int rows,int cols){
        matrice = new NumereComplexe[rows][cols];
    }
    public MatriceComplexa add(MatriceComplexa a){
        MatriceComplexa rez = new MatriceComplexa(matrice.length,matrice[0].length);
        for(int i = 0;i < this.matrice.length;i++){
            for(int j = 0;j < this.matrice[0].length;j++){
                rez.matrice[i][j] = matrice[i][j].adunare(a.matrice[i][j]);
            }
        }
        return rez;
    }
    public MatriceComplexa sub(MatriceComplexa a){
        MatriceComplexa rez = new MatriceComplexa(matrice.length,matrice[0].length);
        for(int i = 0;i < this.matrice.length;i++){
            for(int j = 0;j < this.matrice[0].length;j++){
                rez.matrice[i][j] = matrice[i][j].scadere(a.matrice[i][j]);
            }
        }
        return rez;
    }

    @Override
    public String toString(){
        for(int i = 0;i < matrice.length;i++){
            for(int j = 0;j < matrice[0].length;j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        return "";
    }
}
