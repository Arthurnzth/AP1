import java.util.Locale;
import java.util.Scanner;

public class Exercicio22Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nComplete as informações para saber o salário total\n\n");
        System.out.print("Digite o valor do salário fixo: R$");
        double salarioFixo = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: R$");
        double valorVendas = Double.parseDouble(teclado.nextLine());
        double comissao = 0, salarioTotal = 0, comissaoEx = 0;
        if(valorVendas<=1500){
            comissao = valorVendas*0.03;
            salarioTotal = salarioFixo+comissao;
            System.out.printf("Salário total: R$%.2f", salarioTotal);
        }
        else{
            comissao = 1500*0.03;
            comissaoEx = (valorVendas-1500)*0.05;
            salarioTotal = salarioFixo+comissao+comissaoEx;
            System.out.printf("Salário total: R$%.2f", salarioTotal);
        }
        teclado.close();
    }
}