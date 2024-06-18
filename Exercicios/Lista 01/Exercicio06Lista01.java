import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int valorN;
        System.out.print("\nInforme um valor X inteiro para ver os X primeiros números da série de Fibonacci\n\n");
        System.out.print("Digite o valor: ");
        valorN = Integer.parseInt(teclado.nextLine());
        if(valorN<=0||valorN>=46){
            System.out.print("\nValor não permitido");
        }
        else{
            int x = 0, y = 1, z = 0;
            System.out.print("\n" + x + " " + y + " ");
            for(int i=0;i<(valorN-2);i++){
                z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
            }
        }
        teclado.close();
    }
}