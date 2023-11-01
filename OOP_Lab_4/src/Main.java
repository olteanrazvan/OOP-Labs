public class Main {
    public static void main(String[] args) {
        NumereComplexe a = new NumereComplexe(4,5);
        NumereComplexe b = new NumereComplexe(2,6);
        System.out.println(a.adunare(b));
        System.out.println(a.scadere(b));
        System.out.println(a.inmultireScalar(10));
        System.out.println(a.inmultire(b));

        int[] arr = new int[]{1,2,3};
        int[] arr2 = arr;
        arr2[1] = 5;
        System.out.println(arr[1]);

        String str = "hello";
        System.out.println(str.length());
        System.out.println(arr.length);

        for(int element:arr)
            System.out.println(element);

        int[] arr1 = new int[3];
        System.arraycopy(arr,0,arr1,0,arr.length);

        MatriceComplex matrix1 = new MatriceComplex(2,2);
        MatriceComplex matrix2 = new MatriceComplex(2,2);

        matrix1.matrice[0][0] = new NumereComplexe(1,5);
        matrix1.matrice[0][1] = new NumereComplexe(2,6);
        matrix1.matrice[1][0] = new NumereComplexe(3,7);
        matrix1.matrice[1][1] = new NumereComplexe(4,8);
        System.arraycopy(matrix1.matrice,0,matrix2.matrice,0,2);

        MatriceComplex rez = new MatriceComplex(2,2);
        rez = matrix1.add(matrix2);
        for(int i = 0;i < rez.matrice.length;i++) {
            for (int j = 0; j < rez.matrice[0].length; j++) {
                System.out.print(rez.matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        rez = matrix1.sub(matrix2);
        for(int i = 0;i < rez.matrice.length;i++) {
            for (int j = 0; j < rez.matrice[0].length; j++) {
                System.out.print(rez.matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        rez = matrix1.multiplyBy(10);
        for(int i = 0;i < rez.matrice.length;i++) {
            for (int j = 0; j < rez.matrice[0].length; j++) {
                System.out.print(rez.matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}