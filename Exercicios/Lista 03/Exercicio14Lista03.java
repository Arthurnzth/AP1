import java.util.Scanner;

public class Exercicio14Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um valor inteiro: ");
        int valor = Integer.parseInt(teclado.nextLine());
        if(valor%2==0){
            System.out.print("\nÉ PAR!");
        }
        else{
            System.out.print("\nÉ ÍMPAR!");
        }
        teclado.close();
    }
}