import java.util.Locale;
import java.util.Scanner;

public class Exercicio11Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme o salário mensal do funcionário e o reajuste para obter o valor do novo salário\n\n");
        System.out.print("DIgite o salário atual: ");
        double salario = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o percentual do reajuste: ");
        double reajuste = Double.parseDouble(teclado.nextLine());
        double salarioN = (salario*(1+(reajuste/100)));
        System.out.printf("\nNovo salário: R$%.2f", salarioN);
        teclado.close();
    }   
}