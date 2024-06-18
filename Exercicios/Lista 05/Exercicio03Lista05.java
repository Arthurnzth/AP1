import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Lista05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite um número inteiro maior que 20: ");
        int val = Integer.parseInt(teclado.nextLine());
        int i = 1;
        while(val<=20){
            System.out.print("\nValor não permitido. Digite um número inteiro maior que 20: ");
            val = Integer.parseInt(teclado.nextLine());
        }
        System.out.printf("\nDivisores de %d: \n", val);
        while(i<=val){
            if(val%i==0){
                System.out.print(i + "\t");
            }
            i++;
        }
        teclado.close();
    }
}