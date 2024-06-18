import java.util.Locale;
import java.util.Scanner;

public class Exercicio10Lista08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int x = 0, cont0 = 0;
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] comuns = new int[10];
        boolean contem = true, ordenado = false;

        System.out.print("Digite 5 números diferentes de 0:\n");
        for(int i=0;i<5;i++){
            System.out.printf("%dº número: ", i+1);
            vetor1[i] = sc.nextInt();
        }

        System.out.print("\nDigite mais 5 números diferentes de 0:\n");
        for(int i=0;i<5;i++){
            System.out.printf("%dº número: ", i+1);
            vetor2[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(vetor1[i]==vetor2[j]){
                    comuns[i] = vetor2[j];
                }
            }
        }

        while(!ordenado){
            ordenado = true;
            for(int i=0;i<comuns.length-1;i++){
                if(comuns[i]>comuns[i+1]){
                    ordenado = false;
                    x = comuns[i+1];
                    comuns[i+1] = comuns[i];
                    comuns[i] = x;
                }
            }
        }

        for(int i=0;i<comuns.length;i++){
            if(comuns[i]==0){
                cont0++;
            }
        }
        if(cont0==comuns.length){
            contem = false;
        }

        if(contem==false){
            System.out.print("\nNão há números em comum aos dois conjuntos digitados");
        }
        else{
            System.out.print("\nOs números em comum aos dois conjuntos digitados são:");
            for(int i=0;i<comuns.length-1;i++){
                if(comuns[i]!=comuns[i+1]){
                    System.out.print(" " + comuns[i+1]);
                }
            }
        }

        sc.close();
    }
}