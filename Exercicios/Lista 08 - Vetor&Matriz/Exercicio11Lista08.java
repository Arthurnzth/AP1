import java.util.Locale;
import java.util.Scanner;

public class Exercicio11Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite 10 números inteiros para serem inseridos em um vetor:\n");

        int[] numeros = new int[10];
        int[] numerosDesloc = new int[10];

        for(int i=0;i<10;i++){
            System.out.printf("%dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nInsira um valor de deslocamento para o vetor: ");
        int desloc = sc.nextInt();

        for(int i=0;i<10;i++){
            if(i-desloc<0){
                if(desloc>numeros.length){
                    while(desloc>numeros.length){
                        desloc -= 10;
                    }
                    numerosDesloc[i] = numeros[i+(numeros.length-desloc)];
                }
                else{
                    numerosDesloc[i] = numeros[i+(numeros.length-desloc)];
                }
            }
            else{
                numerosDesloc[i] = numeros[i-desloc];
            }
        }

        System.out.print("\nVetor resultante:");
        for(int i=0;i<10;i++){
            System.out.print(" " +numerosDesloc[i]);
        }

        sc.close();
    }
}