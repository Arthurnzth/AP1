import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Lista05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite 10 valores:\n");
        System.out.print("1º número: ");
        long val = Long.parseLong(teclado.nextLine());
        long maior = val, menor = val;
        long i = 2;
        while(i<11){
            System.out.printf("%dº número: ", i);
            val = Long.parseLong(teclado.nextLine());
            if(maior<val){
                maior = val;
            }
            if(menor>val){
                menor = val;
            }
            i++;
        }
        System.out.printf("\nMaior: %d\nMenor: %d", maior, menor);
        teclado.close();
    }
}