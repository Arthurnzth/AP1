import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Lista04 {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite o nome do produto: ");
        String product = board.nextLine();
        System.out.print("Digite o valor da compra: R$");
        double price = Double.parseDouble(board.nextLine());
        double selling = 0;
        if(price<100){
            selling = (price+(price*0.70));
            System.out.printf("Produto: %s, Valor de compra: R$%.2f, Valor de venda: R$%.2f", product, price, selling);
        }
        else{
            if(price>=100&&price<=200){
                selling = (price+(price*0.50));
                System.out.printf("Produto: %s, Valor de compra: R$%.2f, Valor de venda: R$%.2f", product, price, selling);
            }
            else{
                if(price>200){
                    selling = (price+(price*0.30));
                    System.out.printf("Produto: %s, Valor de compra: R$%.2f, Valor de venda: R$%.2f", product, price, selling);
                }
            }
        }
        board.close();
    }
}