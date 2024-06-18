import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Lista02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme o valor de 4 produtos para saber o valor total final\n\n");
        System.out.print("Digite o valor do primeiro produto: ");
        double valor1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor do segundo produto: ");
        double valor2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor do terceiro produto: ");
        double valor3 = Double.parseDouble(teclado.nextLine());
        System.out.print("DIgite o valor do quarto produto: ");
        double valor4 = Double.parseDouble(teclado.nextLine());
        double total = (valor1+valor2+valor3+valor4);
        if(total<=100){
            System.out.printf("\nValor a pagar: R$%.2f.", total);
        }
        else{
            if(total>100&&total<200){
                total = ((valor1*0.9)+valor2+valor3+valor4);
                System.out.printf("\nValor a pagar: R$%.2f.", total);
            }
            else{
                if(total>=200&&total<=500){
                    total = ((valor1*0.85)+(valor2*0.85)+valor3+valor4);
                    System.out.printf("\nValor a pagar: R$%.2f.", total);
                }
                else{
                    if(total>500){
                        total *= 0.75;
                        System.out.printf("\nValor a pagar: R$%.2f.", total);
                    }
                }
            }
        }
        teclado.close();
    }
}