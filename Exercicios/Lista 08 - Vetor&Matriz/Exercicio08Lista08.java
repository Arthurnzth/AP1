import java.util.Locale;
import java.util.Scanner;

public class Exercicio08Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite 9 números inteiros para serem inseridos numa matriz 3x3:\n\n");

        int[][] matriz = new int[3][3];
        int soma = 0;
        int cont = 1;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%dº número: ", cont);
                matriz[i][j] = sc.nextInt();
                cont++;
            }
        }

        for(int i=0;i<3;i++){
            soma = 0;
            System.out.printf("\nSoma dos números da %dª linha: ", i+1);
            for(int j=0;j<3;j++){
                soma += matriz[i][j];
            }
            System.out.print(soma);
        }

        for(int i=0;i<3;i++){
            soma = 0;
            System.out.printf("\nSoma dos números da %dª coluna: ", i+1);
            for(int j=0;j<3;j++){
                soma += matriz[j][i];
            }
            System.out.print(soma);
        }

        sc.close();
    }
}