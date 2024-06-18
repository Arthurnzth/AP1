import java.util.Scanner;

public class Exercicio07Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDIgite um número para saber se ele é perfeito: ");
        int num = Integer.parseInt(teclado.nextLine());
        int soma = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                soma += i;
            }
        }
        if(soma==num){
            System.out.printf("\nO número %d é um número perfeito", num);
        }
        else{
            System.out.printf("\nO número %d é não um número perfeito", num);
        }
        teclado.close();
    }
}