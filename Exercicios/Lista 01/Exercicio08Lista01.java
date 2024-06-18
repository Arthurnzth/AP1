import java.util.Locale;
import java.util.Scanner;

public class Exercicio08Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int valorX;
        System.out.print("\nInforme um valor inteiro para saber se ele é um número perfeito\n\n");
        System.out.print("Digite o valor: ");
        valorX = Integer.parseInt(teclado.nextLine());
        if(valorX<1||valorX>108){
            System.out.print("\nValor não permitido");
        }
        else{
            int soma = 0;
            for(int i=1;i<=(valorX/2);i++){
                if(valorX%i==0){
                    soma += i;
                }
            }
            if(soma==valorX){
                System.out.print("\nO número " + valorX + " é um número perfeito");
            }
            else{
                System.out.print("\nO número " + valorX + " não é um número perfeito");
            }
        }
        teclado.close();
    }
}