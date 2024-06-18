import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme a idade compsta em anos, meses e dias para saber a idade total em dias\n\n");
        System.out.print("DIgite o número de anos: ");
        int anos = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o número de meses: ");
        int meses = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o números de dias: ");
        int dias = Integer.parseInt(teclado.nextLine());
        int diasT = ((anos*365)+(meses*30)+dias);
        System.out.printf("\nIdade total em dias: %d", diasT);
        teclado.close();
    }
}