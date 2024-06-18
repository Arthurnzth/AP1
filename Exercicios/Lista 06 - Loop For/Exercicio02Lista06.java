import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite 10 valores:\n");
        System.out.print("1º número: ");
        long val = Long.parseLong(teclado.nextLine());
        long maior = val, menor = val;
        for(int i=2;i<11;i++){
            System.out.printf("%dº número: ", i);
            val = Long.parseLong(teclado.nextLine());
            if(maior<val){
                maior = val;
            }
            if(menor>val){
                menor = val;
            }
        }
        System.out.printf("\nMaior: %d\nMenor: %d", maior, menor);
        teclado.close();
    }
}