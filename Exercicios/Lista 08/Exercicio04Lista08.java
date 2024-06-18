import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite 5 números:\n");
        int[] numeros = new int[5];

        for(int i=0;i<5;i++){
            System.out.printf("\n%dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nNúmeros digitados em ordem inversa:\n");
        for(int i=4;i>=0;i--){
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
