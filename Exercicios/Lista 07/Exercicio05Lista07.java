import java.util.Random;
import java.util.Scanner;

public class Exercicio05Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.print("\nTente adivinhar um número entre 1 e 100: ");
        int num = Integer.parseInt(teclado.nextLine());
        int sort = (aleatorio.nextInt(99)+1), tentativas = 1;
        while(num!=sort){
            System.out.print("\nNúmero incorreto!\n");
            if(num<sort){
                System.out.print("Dica: é maior\n");
            }
            else{
                System.out.print("Dica: é menor\n");
            }
            System.out.print("\nTente novamente. Digite outro número: ");
            num = Integer.parseInt(teclado.nextLine());
            tentativas++;
        }
        if(num==sort){
            System.out.printf("\nNúmero correto! Parabnéns, acertou com %d tentativas.", tentativas);
        }
        teclado.close();
    }
}