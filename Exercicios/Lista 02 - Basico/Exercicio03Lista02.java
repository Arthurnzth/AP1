import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Lista02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in). useLocale(Locale.US);
        System.out.print("\nInforme o valor numérico do salário atual do funcionário: ");
        double salario = Double.parseDouble(teclado.nextLine());
        salario *= 1.25;
        System.out.printf("\nO novo valor do salário do funcionário após o aumento é: R$%.2f", salario);
        teclado.close();
    }
}