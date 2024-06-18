import java.util.Scanner;

public class Exercicio01Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro para obter a tabuada dele de 1 a 10: ");
        int num = Integer.parseInt(teclado.nextLine());
        System.out.print("\n");
        for(int i=1;i<=10;i++){
            System.out.printf("%d × %d = %d\n", num, i, num*i);
        }
        teclado.close();
    }
}