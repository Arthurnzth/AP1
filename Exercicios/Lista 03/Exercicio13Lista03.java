import java.util.Scanner;

public class Exercicio13Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um valor inteiro: ");
        int valor = Integer.parseInt(teclado.nextLine());
        if(valor>10){
            System.out.print("\nÉ MAIOR QUE 10!");
        }
        else{
            System.out.print("\nNÃO É MAIOR QUE 10!");
        }
        teclado.close();
    }
}