import java.util.Scanner;

public class Exercicio24Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme 3 valores inteiros para ordená-los em ordem crescente\n\n");
        System.out.print("Digite o primeiro valor: ");
        int valor1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        int valor2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o terceiro valor: ");
        int valor3 = Integer.parseInt(teclado.nextLine());
        int VALOR1 = 0, VALOR2 = 0, VALOR3 = 0;
        if(valor1>valor2){
            if(valor1>valor3){
                VALOR1 = valor1;
                if(valor2>valor3){
                    VALOR2 = valor2;
                    VALOR3 = valor3;
                }
                else{
                    VALOR2 = valor3;
                    VALOR3 = valor2;
                }
            }
            else{
                VALOR1 = valor3;
                VALOR2 = valor1;
                VALOR3 = valor2;
            }
        }
        else{
            if(valor2>valor3){
                VALOR1 = valor2;
                if(valor1>valor3){
                    VALOR2 = valor1;
                    VALOR3 = valor3;
                }
                else{
                    VALOR2 = valor3;
                    VALOR3 = valor1;
                }
            }
            else{
                VALOR1 = valor3;
                VALOR2 = valor2;
                VALOR3 = valor1;
            }
        }
        System.out.printf("\nOrdem crescente: %d, %d, %d", VALOR3, VALOR2, VALOR1);
        teclado.close();
    }
}