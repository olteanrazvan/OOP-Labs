import java.math.BigInteger;

public class Main {
    public static final BigInteger DOI = new BigInteger("2");

    public static void main(String[] args) {
        BigInteger nrBoabe = new BigInteger("0");
        BigInteger aux = new BigInteger("1");
        int tablaSah = 64;
        for(int i = 1;i <= tablaSah;i++){
            nrBoabe = nrBoabe.add(aux);
            aux = aux.multiply(DOI);
        }
        System.out.println("Numarul total de boabe de pe tabla de sah este:" + nrBoabe);
    }
}