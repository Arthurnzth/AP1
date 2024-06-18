import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Lista05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite 10 valores:\n");
        int i = 1;
        double soma = 0;
        while(i<=10){
            System.out.printf("%dº número: ", i);
            soma += Double.parseDouble(teclado.nextLine());
            i++;
        }
        double media = soma/10;
        System.out.print("\nMédia dos valores: " + media);
        teclado.close();
    }
}