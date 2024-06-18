import java.util.Scanner;

public class Exercicio08Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um caractere maiúsculo de A a Z para obter o caractere minúsculo correspondente: ");   
        char caractereM = teclado.next().charAt(0);
        int intCaractere = (int)caractereM;
        if(intCaractere>=65&&intCaractere<=90){
            char caracterem = (char)(intCaractere+32);
            System.out.printf("\nCaractere minúsculo: %c", caracterem);
        }
        else{
            System.out.println("\nCaractere não permitido. Favor tentar novamente e digitar uma letra maíuscula de A a Z.");
        }
        teclado.close();
    }
}