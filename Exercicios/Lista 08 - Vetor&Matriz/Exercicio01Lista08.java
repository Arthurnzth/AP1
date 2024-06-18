import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a quantidade de números que deseja armazenar: ");
        int tamanho = Integer.parseInt(sc.nextLine());

        double[] numeros = new double[tamanho];
        double soma = 0;

        System.out.print("\nDigite os números:\n");
        for(int i=0;i<tamanho;i++){
            System.out.printf("\n%dº número: ", i+1);
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.print("\nMédia dos valores digitados: " + (soma/tamanho));
    
        sc.close();
    }
}