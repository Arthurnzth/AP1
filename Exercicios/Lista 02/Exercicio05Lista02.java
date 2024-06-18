import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Lista02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme o valor  numérico do salário base do funcionário: ");
        double salarioBase = Double.parseDouble(teclado.nextLine());
        double salarioR = ((salarioBase*1.05)-((salarioBase*1.05)*0.07));
        System.out.printf("\nSalário a receber: R$%.2f.", salarioR);
        teclado.close();
    }
}