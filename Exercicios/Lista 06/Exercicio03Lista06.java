import java.util.Scanner;

public class Exercicio03Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val = 0;
        System.out.print("\nDigite um número inteiro maior que 20: ");
        for(val=Integer.parseInt(teclado.nextLine());val<=20;){
            System.out.print("\nValor não permitido. Digite um número inteiro maior que 20: ");
            val = Integer.parseInt(teclado.nextLine());
            if(val>20){
                teclado.close();
            }
        }
        System.out.printf("\nDivisores de %d: \n", val);
        for(int i=1;i<=val;i++){
            if(val%i==0){
                System.out.print(i + "\t");
            }
        }
    }
}