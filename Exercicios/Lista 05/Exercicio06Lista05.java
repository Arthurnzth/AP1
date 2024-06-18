import java.util.Scanner;

public class Exercicio06Lista05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        int val = Integer.parseInt(teclado.nextLine());
        int i = 1, x = 0, y = 1, z = 0;
        if(val==1){
            System.out.printf("\nO %dº elemento da sequencia de Fibonacci é: %d", val, y);
        }
        else{
            while(i<val){
                z = x + y;
                x = y;
                y = z;
                i++;
            }
            System.out.printf("\nO %dº elemento da sequencia de Fibonacci é: %d", val, z);
        }
        teclado.close();
    }
}