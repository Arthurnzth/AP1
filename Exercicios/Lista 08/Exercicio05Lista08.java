import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite 10 números inteiros:\n");

        int[] numeros = new int[10];
        int positivos = 0, negativos = 0;

        for(int i=0;i<10;i++){
            System.out.printf("\n%dº número: ", i+1);
            numeros[i] = sc.nextInt();
            if(numeros[i]==0){
            }
            else{
                if(numeros[i]>0){
                    positivos++;
                }
                else{
                    negativos++;
                }
            }
        }

        System.out.print("\nQuantidade de números positivos: " + positivos);
        System.out.print("\nQuantidade de números negativos: " + negativos);

        sc.close();
    }
}