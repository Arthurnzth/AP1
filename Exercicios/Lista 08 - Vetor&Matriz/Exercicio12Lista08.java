import java.util.Locale;
import java.util.Scanner;

public class Exercicio12Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[][] matriz = new int[5][5];
        int somaDP = 0, somaDS = 0, cont = 1;

        System.out.print("Digite 25 valores para serem inseridos em uma matriz 5x5:\n");

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.printf("%dº número: ", cont);
                matriz[i][j] = sc.nextInt();
                cont++;
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j){
                    somaDP += matriz[i][j];
                }
            }
        }
        System.out.print("\nSoma dos elementos da diagonal principal: " + somaDP);

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i+j==4){
                    somaDS += matriz[i][j];
                }
            }
        }
        System.out.print("\nSoma dos elementos da diagonal secundária: " + somaDS);

        sc.close();
    }
}