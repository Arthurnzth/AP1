import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio06Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];
        int soma = 0;

        for(int i=0;i<10;i++){
            numeros[i] = (random.nextInt(99)+1);
        }

        System.out.print("10 números aleatórios entre 1 e 100:\n");
        for(int i=0;i<10;i++){
            System.out.print(numeros[i] + " ");
            soma += numeros[i];
        }

        System.out.print("\nA soma desses números é: " + soma);

        sc.close();
    }
}