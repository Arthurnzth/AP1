import java.util.Locale;
import java.util.Scanner;

public class Exercicio21Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme 3 valores para formar um triângulo\n\n");
        System.out.print("Digite o primeiro valor: ");
        double valor1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        double valor2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o terceiro valor: ");
        double valor3 = Double.parseDouble(teclado.nextLine());
        double valorA, valorB, valorC;
        if(valor1>valor2){
            if(valor1>valor3){
                valorA = valor1;
                if(valor2>valor3){
                    valorB = valor2;
                    valorC = valor3;
                }
                else{
                    valorB = valor3;
                    valorC = valor2;
                }
            }
            else{
                valorA = valor3;
                valorB = valor1;
                valorC = valor2;
            }
        }
        else{
            if(valor2>valor3){
                valorA = valor2;
                if(valor1>valor3){
                    valorB = valor1;
                    valorC = valor3;
                }
                else{
                    valorB = valor3;
                    valorC = valor1;
                }
            }
            else{
                valorA = valor3;
                valorB = valor2;
                valorC = valor1;
            }
        }
        if(valorA>=(valorB+valorC)){
            System.out.print("\nNÃO FORMA TRIÂNGULO");
        }
        else{
            if(valorA==valorB){
                if(valorB==valorC){
                    System.out.print("\nTRIÂNGULO EQUILÁTERO");
                }
                else{
                    System.out.print("\nTRIÂNGULO ISÓSCELES");
                }
            }
            else{
                if(valorB==valorC){
                    System.out.print("\nTRIÂNGULO ISÓSCELES");
                }
                if(valorA==valorC){
                    System.out.print("\nTRIÂNGULO ISÓSCELES");
                }
            }
            if(valorA!=valorB&&valorB!=valorC&&valorA!=valorC){
                System.out.print("\nTRIÂNGULO ESCALENO");
            }
        }
        teclado.close();
    }
}