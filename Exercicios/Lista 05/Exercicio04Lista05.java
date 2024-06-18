import java.util.Scanner;

public class Exercicio04Lista05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro maior que 100: ");
        int val = Integer.parseInt(teclado.nextLine());
        int i = 1, divs = 0;
        while(val<=100){
            System.out.print("\nValor não permitido. Digite um número inteiro maior que 100: ");
            val = Integer.parseInt(teclado.nextLine());
        }
        while(i<=val){
            if(val%i==0){
                divs++;
            }
            i++;
        }
        if(divs==2){
            System.out.print("O número " + val + " informado é primo");
        }
        else{
            System.out.print("O número " + val + " informado não é primo");
        }
        teclado.close();
    }
}