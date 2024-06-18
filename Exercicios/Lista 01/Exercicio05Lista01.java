import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double valor1, valor2, valor3, valorA, valorB, valorC;
        System.out.print("\nInforme 3 valores para saber se formam ou não um triângulo\n\n");
        System.out.print("Digite o primeiro valor: ");
        valor1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        valor2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o terceiro valor: ");
        valor3 = Double.parseDouble(teclado.nextLine());
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
        System.out.printf("\nOs valores informados foram: %f, %f e %f\n", valorA, valorB, valorC);
        if(valorA>=(valorB+valorC)){
            System.out.println("\nNÃO FORMA TRIÂNGULO");
        }
        else{
            if((Math.pow(valorA, 2))==((Math.pow(valorB, 2))+(Math.pow(valorC, 2)))){
                System.out.println("\nTRIÂNGULO RETÂNGULO");
            }
            else{
                if((Math.pow(valorA, 2))>((Math.pow(valorB, 2))+(Math.pow(valorC, 2)))){
                    System.out.println("\nTRIÂNGULO OBTUSÂNGULO");
                }
                else{
                    System.out.println("\nTRIÂNGULO ACUTÂNGULO");
                }
                if(valorA==valorB){
                    if (valorB==valorC) {
                        System.out.println("\nTRIÂNGULO EQUILÁTERO");
                    }
                    else{
                        System.out.println("\nTRIÂNGULO ISÓSCELES");
                    }
                }
                else{
                    if(valorB==valorC){
                        System.out.println("\nTRIÂNGULO ISÓSCELES");
                    }
                    if(valorA==valorC){
                        System.out.println("\nTRIÂNGULO ISÓSCELES");
                    }
                }   
                if(valorA!=valorB) {
                    if(valorB!=valorC){
                        if(valorA!=valorC){
                            System.out.println("\nTRIÂNGULO ESCALENO");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}