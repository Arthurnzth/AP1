import java.util.Locale;
import java.util.Scanner;

public class Exercicio12Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme o custo de fábrica do carro para saber o custo final do consumidor: ");
        double custoFab = Double.parseDouble(teclado.nextLine());
        double custoFinal = (custoFab+(custoFab*0.28)+(custoFab*0.45));
        System.out.printf("\nCusto final: R$%.2f", custoFinal);
        teclado.close();
    }
}