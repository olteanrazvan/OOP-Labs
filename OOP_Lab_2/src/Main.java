import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        System.out.println("Valoarea citita este:" + inputValue);

        int maxInt = Integer.MAX_VALUE;

        try{
            System.out.println(maxInt / inputValue);
        }
        catch(ArithmeticException exception){
            System.out.println("Eroare");
            inputValue = input.nextInt();
        }
        System.out.println("Noua valoare:" + inputValue);

    }
}