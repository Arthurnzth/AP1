import java.util.Locale;
import java.util.Scanner;

public class Exercicio27Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nComplete as informações para saber o valor total a pagar, considerando os descontos\n\n");
        System.out.print("Digite o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a quantidade adquirida: ");
        int qntd = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o preço unitário: R$");
        double valUni = Double.parseDouble(teclado.nextLine());
        if(qntd<=5){
            double total = (qntd*valUni)*0.98;
            System.out.printf("\nTotal a pagar: R$%.2f de %s", total, nome);
        }
        if(qntd>5&&qntd<=10){
            double total = (qntd*valUni)*0.97;
            System.out.printf("\nTotal a pagar: R$%.2f de %s", total, nome);
        }
        if(qntd>10){
            double total = (qntd*valUni)*0.95;
            System.out.printf("\nTotal a pagar: R$%.2f de %s", total, nome);
        }
        teclado.close();
    }
}