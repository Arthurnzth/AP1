import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite um valor inteiro para saber seu sucessor e seu antecessor: ");
        int valor = Integer.parseInt(teclado.nextLine());
        int sucessor = valor + 1, antecessor = valor - 1;
        System.out.printf("\nSucessor: %d\nAntecessor: %d", sucessor, antecessor);
        teclado.close();
    }
}