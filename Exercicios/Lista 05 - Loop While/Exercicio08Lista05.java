import java.util.Scanner;

public class Exercicio08Lista05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número maior que 30: ");
        int val = Integer.parseInt(teclado.nextLine());
        int i = 0;
        while(val<=30){
            System.out.print("\nValor não permitido. Digite um número maior que 30: ");
            val = Integer.parseInt(teclado.nextLine());
        }
        System.out.printf("\nNúmeros entre 0 e %d que são multiplos de 2 ou 7: ", val);
        while(i<=val){
            if(i%2==0||i%7==0){
                System.out.print(i + " ");
            }
            i++;
        }
        teclado.close();
    }
}