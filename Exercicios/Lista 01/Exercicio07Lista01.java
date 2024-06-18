import java.util.Locale;
import java.util.Scanner;

public class Exercicio07Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int valorX, divisores = 0;
        System.out.print("\nInforme um valor inteiro para saber se ele é primo\n\n");
        System.out.print("Digite o valor: ");
        valorX = Integer.parseInt(teclado.nextLine());
        if(valorX<=1||valorX>107){
            System.out.print("\nValor não permitido");
        }
        else{
            for(int i=1;i<=valorX;i++){
                if(valorX%i==0){
                    divisores++;
                }
            }
            if(divisores==2){
                System.out.print("\nO número " + valorX + " é primo");
            }
            else{
                System.out.print("\nO número " + valorX + " não é primo");
            }
        }
        teclado.close();
    }
}