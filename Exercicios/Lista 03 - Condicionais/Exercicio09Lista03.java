import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio09Lista03 {
    static final double PI = 3.14159265359;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite um valor para saber o valor das expressões do exercício, para este valor de x: ");
        double valorX = Double.parseDouble(teclado.nextLine());
        double valorYA = ((Math.pow(valorX,3))+(5*(Math.pow(valorX,7)))+(2*(Math.pow(valorX,9))));
        double valorYB = ((Math.sin(valorX*(PI/180)))/valorX);
        double valorYC = ((Math.pow((1+(1/valorX)),valorX)));
        double valorYD = (Math.sqrt((Math.log(Math.abs(valorX)+1))+((Math.log(Math.abs(valorX)+1))/(Math.log(2)))));
        double valorYE = ((Math.asin(valorX))+(Math.acos(valorX)));
        System.out.print("\na) y = " + valorYA + "\n");
        System.out.print("b) y = " + valorYB + "\n");
        System.out.print("c) y = " + valorYC + "\n");
        System.out.print("d) y = " + valorYD + "\n");
        System.out.print("e) y = " + valorYE + ". ");
        if(!(valorX>=-1&&valorX<=1)){
            System.out.print("Indefinido, pois o valor de x está fora de -1 <= x <= 1");
        }
        teclado.close();
    }
}