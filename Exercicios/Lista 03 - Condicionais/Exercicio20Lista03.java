import java.util.Locale;
import java.util.Scanner;

public class Exercicio20Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite as notas do aluno\n\n");
        System.out.print("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(teclado.nextLine());
        double media = (nota1+nota2)/2;
        if(media>=7.0){
            System.out.printf("Aprovado\nNota: %.1f", media);
        }
        else{
            System.out.print("Digite a nota do Exame Final: ");
            double notaEF = Double.parseDouble(teclado.nextLine());
            double mediaFinal = (nota1+nota2+notaEF)/3;
            System.out.printf("\nMédia final: %.1f", mediaFinal);
            if(mediaFinal>=7.0){
                System.out.print("\nAprovado\nNota: 6");
            }
            else{
                System.out.print("\nReprovado");
            }
        }
        teclado.close();
    }
}