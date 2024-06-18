import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("DIgite 20 números inteiros: \n");

        int[] numeros = new int[20];

        for(int i=0;i<20;i++){
            System.out.printf("\n%dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nNúmeros pares digitados:\n");
        for(int i=0;i<20;i++){
            if(numeros[i]%2==0){
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.print("\nNúmeros ímpares digitados:\n");
        for(int i=0;i<20;i++){
            if(numeros[i]%2==1){
                System.out.print(numeros[i] + " ");
            }
        }
        
        sc.close();
    }
}
