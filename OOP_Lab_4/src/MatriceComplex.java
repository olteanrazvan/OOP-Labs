public class MatriceComplex {
    NumereComplexe[][] matrice;
    MatriceComplex(int rows,int cols){
        matrice = new NumereComplexe[rows][cols];
    }

    public MatriceComplex add(MatriceComplex b){
        MatriceComplex rez = new MatriceComplex(matrice.length, matrice[0].length);
        for(int i = 0; i < matrice.length;i++){
            for(int j = 0; j < matrice[0].length;j++){
                rez.matrice[i][j] = this.matrice[i][j].adunare(b.matrice[i][j]);
            }
        }
        return rez;
    }
    public MatriceComplex sub(MatriceComplex b){
        MatriceComplex rez = new MatriceComplex(matrice.length,matrice[0].length);
        for(int i = 0; i < matrice.length;i++){
            for(int j = 0; j < matrice[0].length;j++) {
                rez.matrice[i][j] = matrice[i][j].scadere(b.matrice[i][j]);
            }
        }
        return rez;
    }

    public MatriceComplex multiplyBy(int b){
        MatriceComplex rez = new MatriceComplex(matrice.length,matrice[0].length);
        for(int i = 0; i < matrice.length;i++){
            for(int j = 0; j < matrice[0].length;j++) {
                rez.matrice[i][j] = matrice[i][j].inmultireScalar(b);
            }
        }
        return rez;
    }
}
