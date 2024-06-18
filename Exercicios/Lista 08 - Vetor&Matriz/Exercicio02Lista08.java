import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite 15 números inteiros:\n");

        int[] numeros = new int[15];
        int i = 1, maior = 0, menor = 0;

        System.out.print("\n1º número: ");
        numeros[0] = sc.nextInt();
        maior = numeros[0];
        menor = numeros[0];

        while(i<15){
            System.out.printf("\n%dº número: ", i+1);
            numeros[i] = sc.nextInt();
            if(numeros[i]>maior){
                maior = numeros[i];
            }
            if(numeros[i]<menor){
                menor = numeros[i];
            }
            i++;
        }

        System.out.print("\nMaior: " + maior);
        System.out.print("\nMenor: " + menor);

        sc.close();
    }
}