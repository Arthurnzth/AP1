import java.util.Locale;
import java.util.Scanner;

public class Exercicio07Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 10 números inteiros:\n");

        int[] numeros = new int[10];
        int[] repeticoes = new int[10];

        for(int i=0;i<10;i++){ // ler os valores do usuário e colcoar no vetor "numeros[]"
            System.out.printf("\n%dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nRepetições:\n");

        int x = 0;
        boolean ordenado = false;
        while(!ordenado){ // ordenar o vetor "numeros[]" em ordem crescente
            ordenado = true;
            for(int i=0;i<numeros.length-1;i++){ // laço que comapra o índice atual com o próximo
                if(numeros[i]>numeros[i+1]){
                    ordenado = false;
                    x = numeros[i+1];
                    numeros[i+1] = numeros[i];
                    numeros[i] = x;
                }
            }
        }

        int cont = 0;
        for(int i=0;i<numeros.length;i++){ // contar repetições dos números
            cont = 0;
            for(int j=0;j<numeros.length;j++){
                if(numeros[j]==numeros[i]){
                    cont++;
                    repeticoes[i] = cont; // para tal elemento em numeros[i] repetiu repeticoes[i]
                }
            }
        }

        System.out.print("\nO número " + numeros[0] + " apareceu " + repeticoes[0] + "x");
        for(int i=0; i<numeros.length-1; i++){ // laço condicional para mostrar os repetidos uma vez só
            if(numeros[i]!=numeros[i+1]){
                System.out.print("\nO número " + numeros[i+1] + " apareceu " + repeticoes[i+1] + "x");
            }
        }

        sc.close();
    }
}