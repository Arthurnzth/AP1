import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite 10 valores:\n");
        double soma = 0;
        for(int i=1;i<=10;i++){
            System.out.printf("%dº número: ", i);
            soma += Double.parseDouble(teclado.nextLine());
        }
        double media = soma/10;
        System.out.print("\nMédia dos valores: " + media);
        teclado.close();
    }
}