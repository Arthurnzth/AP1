import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Lista02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in). useLocale(Locale.US);
        System.out.print("\nInforme o valor do salário do funcionário e o valor percentual de aumento\n\n");
        System.out.print("Digite o valor numérico do salário: ");
        double salario = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite apenas o valor numérico do percentual de aumento: ");
        double aumentoP = Double.parseDouble(teclado.nextLine());
        double aumentoV = (salario*(aumentoP/100));
        double salarioN = salario+aumentoV;
        System.out.printf("\nO valor atualizado do salário é de R$ %.2f, com um aumento no valor de R$ %.2f.", salarioN, aumentoV);
        teclado.close();
    }
}