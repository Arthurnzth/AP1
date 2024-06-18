import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Exercicio01Lista01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double valorA, valorB, valorC;
        System.out.print("\nInforme 3 valores para calcular as raízes da equação de Bhaskara\n\n");
        System.out.print("Digite o primeiro valor: ");
        valorA = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        valorB = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o terceito valor: ");
        valorC = Double.parseDouble(teclado.nextLine());
        System.out.print("\nOs valores informados foram: " + valorA + ", " + valorB + " e " + valorC + ".");
        System.out.print("\nCalculando raízes...\n");
        if(valorA==0){
            System.out.print("\nImpossível calcular raízes.");
        }
        else{
            double delta = ((Math.pow(valorB,2))-(4*valorA*valorC));
            if(delta<0){
                System.out.print("\nImpossível calcular raízes.");
            }
            else{
                double negativo = -1;
                double numerador1 = ((negativo*valorB)+(Math.sqrt(delta)));
                double numerador2 = ((negativo*valorB)-(Math.sqrt(delta)));
                double denominador = (2*valorA);
                double raiz1 = (numerador1/denominador);
                double raiz2 = (numerador2/denominador);
                if(raiz1==raiz2){
                    System.out.printf("\nA raíz é: %f", raiz1);
                }
                else{
                    System.out.printf("\nAs raízes são: %f e %f", raiz1, raiz2);
                }
            }
        }
        teclado.close();
    }
}