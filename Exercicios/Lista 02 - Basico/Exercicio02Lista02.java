import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Lista02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double nota1, nota2, nota3, media;
        System.out.print("\nInforme 3 notas para calcular a média\n\n");
        System.out.print("Digite a primeira nota: ");
        nota1 = Double.parseDouble(teclado.nextLine());
        System.out.print("\nDigite a segunda nota: ");
        nota2 = Double.parseDouble(teclado.nextLine());
        System.out.print("\nDigite a terceira nota: ");
        nota3 = Double.parseDouble(teclado.nextLine());
        media = ((nota1+nota2+nota3)/3);
        System.out.printf("\nA média é: %f", media);
        teclado.close();
    }
}