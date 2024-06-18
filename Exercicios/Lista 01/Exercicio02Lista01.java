import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double notaA, notaB;
        System.out.print("\nInforme as notas do aluno com uma casa decimal para fazer a média\n\n");
        System.out.print("Digite a primeira nota: ");
        notaA = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a segunda nota: ");
        notaB = Double.parseDouble(teclado.nextLine());
        System.out.printf("\nNotas: %.1f e %.1f", notaA, notaB);
        double media = (((notaA*3.5)+(notaB*7.5))/(3.5+7.5));
        System.out.printf("\nMEDIA: %.1f", media);
        teclado.close();
    }
}