import java.util.Scanner;

public class Exercicio15Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme o número de maçãs para saber o valor final da compra: ");
        int qntd = Integer.parseInt(teclado.nextLine());
        double total;
        if(qntd<12){
            total = qntd*1.3;
            System.out.printf("\nCompra: R$%.2f", total);
        }
        else{
            total = qntd*1;
            System.out.printf("\nCompra: R$%.2f", total);
        }
        teclado.close();
    }
}