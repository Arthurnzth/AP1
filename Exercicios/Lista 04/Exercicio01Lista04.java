import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Lista04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nPreencha os dados a seguir para se candidatar:\n");
        System.out.print("\nIdade: ");
        int age = Integer.parseInt(teclado.nextLine());
        System.out.print("Altura em centímetros: ");
        int high = Integer.parseInt(teclado.nextLine());
        System.out.print("(Digite 1 para Feminino e 2 para Masculino)\nSexo: ");
        int gender = Integer.parseInt(teclado.nextLine());
        if(gender==1&&high>=180&&age>16){
            System.out.print("\nApto a jogar no time feminino de basquete.");
        }
        else{
            if(gender==2&&high>=180&&age>16){
                System.out.print("\nApto a jogar no time masculino de basquete.");
            }
            else{
                System.out.print("\nNão apto");
            }
        }
        teclado.close();
    }
}