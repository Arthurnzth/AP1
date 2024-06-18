import java.util.Scanner;

public class Exercicio06Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme a razão de uma Progressão Aritmética (PA) e o primeiro termo desta:");
        System.out.print("\nRazão da PA: ");
        int razao = Integer.parseInt(teclado.nextLine());
        System.out.print("Primeiro termo da PA: ");
        int termo = Integer.parseInt(teclado.nextLine());
        System.out.print("\nOs 10 primeiros termos dessa Progressão Aritmética são: ");
        for(int i=0;i<9;i++){
            System.out.print(termo + ", ");
            termo += razao;
        }
        System.out.print("e " + (termo));
        teclado.close();
    }
}