import java.util.Scanner;

public class Exercicio09Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro positivo para exibir a sequência de Collatz para este número: ");
        int num = Integer.parseInt(teclado.nextLine());
        System.out.printf("\nSequência de Collatz para %d:\n", num);
        System.out.print(num + " -> ");
        while(num!=2){
            if(num%2==0){
                num /= 2;
                System.out.print(num + " -> ");
            }
            else{
                num = (3*num)+1;
                System.out.print(num + " -> ");
            }
        }
        System.out.print(1);
        teclado.close();
    }
}