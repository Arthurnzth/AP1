import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int valorX, valorY, valor1, valor2, soma;
        System.out.print("\nInforme 2 valores para saber a soma dos números ímpares entre eles\n\n");
        System.out.print("Digite o primeiro valor: ");
        valorX = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        valorY = Integer.parseInt(teclado.nextLine());
        if(valorX<valorY){
            valor1 = valorX;
            valor2 = valorY;
        }
        else{
            valor1 = valorY;
            valor2 = valorX;
        }
        if(valor1-2==valor2||valor1==valor2-2||valor1==valor2){
            soma = 0;
            System.out.printf("\nA soma dos números ímpares é: %d", soma);
        }
        else{
            if(valor1%2==1||valor1%2==-1){
                soma = valor1 + 2;
                valor1 += 2;
                while(valor1<(valor2-2)){
                    valor1 += 2;
                    soma += valor1;
                }
                System.out.printf("\nA soma dos números ímpares é: %d", soma);
            }
            else{
                valor1 -= 1;
                soma = valor1 + 2;
                valor1 += 2;
                while(valor1<(valor2-2)){
                    valor1 += 2;
                    soma += valor1;
                }
                System.out.printf("\nA soma dos números ímpares é: %d", soma);
            }
        }
        teclado.close();
    }
}