import java.util.Scanner;
import java.util.Locale;

public class Exercicio01Lista02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int valor1, valor2, valor3, valor4, soma;
        System.out.print("\nInforme 4 valores inteiros para obter a soma deles\n\n");
        System.out.print("Digite o primeiro valor: ");
        valor1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        valor2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o terceiro valor: ");
        valor3 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o quarto valor: ");
        valor4 = Integer.parseInt(teclado.nextLine());
        soma = valor1 + valor2 + valor3 + valor4;
        System.out.printf("\nA soma é: %d", soma);
        teclado.close();
    }
}