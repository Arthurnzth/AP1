import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Lista01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double valorV;
        System.out.print("\nInforme um valor para ser decomposto em notas e moedas\n\n");
        System.out.print("Digite o valor: R$");
        valorV = Double.parseDouble(teclado.nextLine());
        if(valorV<0||valorV>1000000.00){
            System.out.println("Valor não permitido");
        }
        else{
            int notas100 = (int)valorV/100;
            int notas50 = (int)((valorV%100)/50);
            int notas20 = (int)(((valorV%100)%50)/20);
            int notas10 = (int)((((valorV%100)%50)%20)/10);
            int notas5 = (int)(((((valorV%100)%50)%20)%10)/5);
            int notas2 = (int)((((((valorV%100)%50)%20)%10)%5)/2);
            int moedas100 = (int)(((((((valorV%100)%50)%20)%10)%5)%2)/1);
            int moedas050 = (int)((((((((valorV%100)%50)%20)%10)%5)%2)%1)/0.50);
            int moedas025 = (int)(((((((((valorV%100)%50)%20)%10)%5)%2)%1)%0.50)/0.25);
            int moedas010 = (int)((((((((((valorV%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10);
            int moedas005 = (int)(((((((((((valorV%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)/0.05);
            int moedas001 = (int)((((((((((((valorV%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)%0.05)/0.01);
            System.out.printf("\nNOTAS:\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n", notas100, notas50, notas20, notas10, notas5, notas2);
            System.out.printf("MOEDAS:\n%d moeda(s) de R$ 1,00\n%d moeda(s) de R$ 0,50\n%d moeda(s) de R$ 0,25\n%d moeda(s) de R$ 0,10\n%d moeda(s) de R$ 0,05\n%d moeda(s) de R$ 0,01", moedas100, moedas050, moedas025, moedas010, moedas005, moedas001);
        }
        teclado.close();
    }
}