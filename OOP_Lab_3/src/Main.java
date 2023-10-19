import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4.2
        int varsta = 20,gen = 1,inaltime = 190;
        short wrap;
        wrap = (short) inaltime;
        wrap = (short) (wrap | ((short) gen << 8));
        wrap = (short) (wrap | ((short) varsta << 9));
        System.out.println(wrap);
        inaltime = wrap & 0xff;
        gen = (wrap>>8) & 1;
        varsta = (wrap>>9) & 0x7f;
        System.out.println(inaltime + " " + gen + " " + varsta);
        System.out.println(gen);
        System.out.println(varsta);

        //4.4
        String str1 = "Ana are ";
        String str2 = "mere";
        String str3 = str1 + str2;
        System.out.println(str3.equals("Ana are mere"));

        //4.1

        int aux = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for(int x = n; x <= m; x++){
            int a = 0,b = 0;
            if(x%2 == 0){
                while(b == 0) {
                    int k = 0;
                    if(aux != 0){
                        a = aux;
                        aux = 0;
                        k++;
                    }
                    for (int y = x - 1; y > 1 && k < 2; y--) {
                        int ok = 1;
                        for (int i = 2; i <= y / 2; i++)
                            if (y % i == 0) {
                                ok = 0;
                                break;
                            }
                        if (ok == 1) {
                            if (k == 0) {
                                a = y;
                                k++;
                            } else if (k == 1) {
                                if (a + y == x) {
                                    b = y;
                                    k++;
                                } else if (aux == 0) {
                                    aux = y;
                                }
                            }
                        }
                    }
                }
                System.out.println(a + "+" + b + "=" + x);
            }
        }

        //4.3

        String str = "elefantul cici";
        int c=0,v=0;
        for(int i=0;i<str.length();i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
                v++;
            else if(str.charAt(i) > 'a' && str.charAt(i) <= 'z') c++;
        }
        System.out.println("Numarul de vocale din sir este: " + v + ",iar numarul de consoane este: " + c);
    }
}