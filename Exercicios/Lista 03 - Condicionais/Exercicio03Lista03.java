import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite uma temperatura em graus Fahrenheit para saber o valor correspondente em graus Celsius: ");
        double tempF = Double.parseDouble(teclado.nextLine());
        double tempC = ((5*(tempF-32))/9);
        System.out.printf("\nTemperatura em graus Celsius: %.2f", tempC);
        teclado.close();
    }
}