import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme 3 notas do aluno para saber a média\n\n");
        System.out.print("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a terceira nota: ");
        double nota3 = Double.parseDouble(teclado.nextLine());
        double media = (((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5));
        System.out.printf("\nMédia: %.2f", media);
        teclado.close();
    }
}