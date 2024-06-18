import java.util.Scanner;

public class Exercicio06Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        int val = Integer.parseInt(teclado.nextLine());
        int x = 0, y = 1, z = 0;
        if(val==1){
            System.out.printf("\nO %dº elemento da sequencia de Fibonacci é: %d", val, y);
        }
        else{
            for(int i=1;i<val;i++){
                z = x + y;
                x = y;
                y = z;
            }
            System.out.printf("\nO %dº elemento da sequencia de Fibonacci é: %d", val, z);
        }
        teclado.close();
    }
}