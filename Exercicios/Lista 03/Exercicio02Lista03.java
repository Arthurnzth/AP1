import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme as dimensões do retângulo (base e altura) para saber a área\n\n");
        System.out.print("Digite o valor da base: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor da altura: ");
        double altura = Double.parseDouble(teclado.nextLine());
        double area = base*altura;
        System.out.printf("\nÁrea do retângulo: %.2f", area);
        teclado.close();
    }
}