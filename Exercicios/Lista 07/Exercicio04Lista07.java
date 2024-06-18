import java.util.Scanner;

public class Exercicio04Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite uma palavra: ");
        String palavra = teclado.nextLine();
        boolean isPalindromo = true;
        int j = 0;
        for(int i=(palavra.length()-1);i>=0;i--){
            if(palavra.charAt(i)==palavra.charAt(j)){
                isPalindromo = true;
                j++;
            }
            else{
                isPalindromo = false;
                break;
            }
        }
        if(isPalindromo==true){
            System.out.printf("\nA palavra %s é um palíndromo", palavra);
        }
        else{
            System.out.printf("\nA palavra %s não é um palíndromo", palavra);
        }
        teclado.close();
    }
}