import java.util.Scanner;

public class Exercicio02Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro positivo para obter seu fatorial: ");
        long num = Long.parseLong(teclado.nextLine());
        teclado.close();
        long fatorial = num;
        System.out.printf("\n%d! = ", num);
        num--;
        for(;num>0;num--){
            fatorial *= num;
        }
        System.out.print(fatorial);
    }
}




