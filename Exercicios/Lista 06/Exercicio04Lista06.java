import java.util.Scanner;

public class Exercicio04Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro maior que 100: ");
        int val = 0;
        int divs = 0;
        for(val=Integer.parseInt(teclado.nextLine());val<=100;){
            System.out.print("\nValor não permitido. Digite um número inteiro maior que 100: ");
            val = Integer.parseInt(teclado.nextLine());
            if(val<100){
                teclado.close();
            }
        }
        for(int i=1;i<=val;i++){
            if(val%i==0){
                divs++;
            }
            i++;
        }
        if(divs==2){
            System.out.print("\nO número " + val + " informado é primo");
        }
        else{
            System.out.print("\nO número " + val + " informado não é primo");
        }
    }
}