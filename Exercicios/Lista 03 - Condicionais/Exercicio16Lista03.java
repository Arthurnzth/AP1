import java.util.Scanner;

public class Exercicio16Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme um par ordenado (x, y) para saber qual quadrante ele pertence\n\n");
        System.out.print("DIgite o valor de x: ");
        double x = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor de y: ");
        double y = Double.parseDouble(teclado.nextLine());
        if(x>0){
            if(y>0){
                System.out.print("\n1º QUADRANTE");
            }
            else{
                System.out.print("\n4º QUADRANTE");
            }
        }
        else{
            if(y>0){
                System.out.print("\n2º QUADRANTE");
            }
            else{
                System.out.print("\n3º QUADRANTE");
            }
        }
        teclado.close();
    }
}