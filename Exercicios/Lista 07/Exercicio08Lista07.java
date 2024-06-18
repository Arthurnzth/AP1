import java.util.Scanner;

public class Exercicio08Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite 2 números para saber todos os números primos nesse intervalo:");
        System.out.print("\nDigite o número inicial: ");
        int ini = Integer.parseInt(teclado.nextLine());
        System.out.print("DIgite o número final: ");
        int fim = Integer.parseInt(teclado.nextLine()), divs = 0, i = 1;
        System.out.print("\nOs números primos nesse intervalo são: ");
        while(ini<fim){
            ini++;
            while(i<=ini){
                if(ini%i==0){
                    divs++;
                }
                i++;
            }
            if(divs==2){
                System.out.print(ini + " ");
                divs = 0;
                i = 1;
            }
            else{
                divs = 0;
                i = 1;
            }
        }
        teclado.close();
    }
}