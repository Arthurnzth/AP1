import java.util.Scanner;

public class Exercicio07Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite quinze (15) números inteiros diferentes de zero:\n");
        int val, positivos = 0, negativos = 0, somaP = 0, somaN = 0;
        for(int i=0;i<15;i++){
            System.out.printf("%dº número: ", i+1);
            for(val = Integer.parseInt(teclado.nextLine());val==0;){
                System.out.printf("Valor igual a 0 não permitido.\nDigite novamento o %dº número: ", i+1);
                val = Integer.parseInt(teclado.nextLine());
            }
            if(val>0){
                positivos++;
                somaP += val;
            }
            else{
                negativos++;
                somaN += val;
            }
        }
        System.out.printf("a) quantidade de números positivos: %d\nb) quantidade de números negativos: %d\n", positivos, negativos);
        System.out.printf("c) soma de todos os valores positivos: %d\nd) soma de todos os valores negativos: %d", somaP, somaN);
        teclado.close();
    }
}