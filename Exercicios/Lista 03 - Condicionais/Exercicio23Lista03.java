import java.util.Locale;
import java.util.Scanner;

public class Exercicio23Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite um valor: ");
        double valor = Double.parseDouble(teclado.nextLine());
        if(valor<0){
            System.out.print("\nO valor é negativo");
        }
        if(valor==0){
            System.out.print("\nO valor é nulo (zero)");
        }
        if(valor>0){
            System.out.print("\nO valor é positivo");
        }
        teclado.close();
    }
}