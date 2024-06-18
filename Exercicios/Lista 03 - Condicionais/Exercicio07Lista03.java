import java.util.Scanner;

public class Exercicio07Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um caractere para saber seu antecessor e sucessor na tabela ASCII: ");
        char caractere = teclado.next().charAt(0);
        char caractereA, caractereS;
        int intCaractere = (int)caractere, intCaractereA, intCaractereS;
        intCaractereS = intCaractere + 1;
        caractereS = (char)intCaractereS;
        intCaractereS = intCaractere + 1;
        intCaractereA = intCaractere - 1;
        caractereS = (char)intCaractereS;
        caractereA= (char)intCaractereA;
        System.out.printf("\nAntecessor: %c\nSucessor: %c", caractereA, caractereS);
        teclado.close();
    }
}