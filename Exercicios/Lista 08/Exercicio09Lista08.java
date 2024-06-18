import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio09Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrizA[i][j] = random.nextInt(26);
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrizB[i][j] = random.nextInt(26);
            }
        }

        System.out.print("Matriz A:\n");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Matriz B:\n");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<4;i++){ //! multiplicação de matrizes
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    matrizC[i][j] += matrizA[i][k]*matrizB[k][j];
                }
                //! cada vez que percorre i e j tem q percorrer diferente coluna ou linha (k) de cada matriz
            }
        }

        System.out.print("A × B = Matriz C:\n");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}