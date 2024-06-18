import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio18Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nInforme 2 valores inteiros para serem usados posteriormente no menu de opções\n\n");
        System.out.print("Digite o primeiro valor: ");
        double v1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        double v2 = Integer.parseInt(teclado.nextLine());
        System.out.print("\n========== MENU DE OPÇÕES ==========\n");
        System.out.print("1) Soma\n2) Diferença\n3) Produto\n4) Divisão\n5) Resto da divisão\n");
        System.out.print("6) Potência (1º elevado ao 2º)\n7) Raiz quadrada de cada");
        System.out.print("\n====================================\n");
        System.out.print("\nDigite uma opção para continuar: ");
        int menuR = Integer.parseInt(teclado.nextLine());
        if(menuR==1){
            double answer = v1+v2;
            System.out.printf("\nSoma: %.0f", answer);
        }
        if(menuR==2){
            double answer = v1-v2;
            System.out.printf("\nDiferença: %.0f", answer);
        }
        if(menuR==3){
            double answer = v1*v2;
            System.out.printf("\nProduto: %.0f", answer);
        }
        if(menuR==4){
            if(v2==0){
                System.out.print("\nO denominador não pode ser 0");
            }
            else{
                double answer = v1/v2;
                System.out.printf("\nDivisão: %.2f", answer);
            }
        }
        if(menuR==5){
            double answer = v1%v2;
            System.out.printf("\nResto: %.0f", answer);
        }
        if(menuR==6){
            double answer = Math.pow(v1,v2);
            System.out.printf("\nPotência: %.0f", answer);
        }
        if(menuR==7){
            double answer1 = Math.sqrt(v1), answer2 = Math.sqrt(v2);
            System.out.printf("\nRaiz de %.0f: %f\nRaiz de %.0f: %f", v1, answer1, v2, answer2);
        }
        teclado.close();
    }
}