import java.util.Scanner;

public class Exercicio26Lista03 {
    public static void main(String[] args) {
        Scanner telcado = new Scanner(System.in);
        System.out.print("\nInforme 2 valores\n\n");
        System.out.print("Digite o primeiro valor: ");
        double val1 = Double.parseDouble(telcado.nextLine());
        System.out.print("Digite o segundo valor: ");
        double val2 = Double.parseDouble(telcado.nextLine());
        if(val1==val2){
            System.out.print("\nNúmeros iguais");
        }
        else{
            if(val1>val2){
                System.out.print("\nPrimeiro é maior");
            }
            else{
                System.out.print("\nSegundo é maior");
            }
        }
        telcado.close();
    }
}