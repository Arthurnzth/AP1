import java.util.Scanner;

public class Exercicio08Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número maior que 30: ");
        int val = 0;
        for(val = Integer.parseInt(teclado.nextLine());val<=30;){
            System.out.print("\nValor não permitido. Digite um número maior que 30: ");
            val = Integer.parseInt(teclado.nextLine());
            if(val>30){
                teclado.close();
            }
        }
        System.out.printf("\nNúmeros entre 0 e %d que são multiplos de 2 ou 7: ", val);
        for(int i=0;i<=val;i++){
            if(i%2==0||i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}