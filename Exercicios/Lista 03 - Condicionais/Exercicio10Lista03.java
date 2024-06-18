import java.util.Scanner;

public class Exercicio10Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme o número total de eleitores do município, o número de votos brancos, nulos e válidos, para saber o percentual que cada um representa do total.\n\n");
        System.out.print("Digite o número de eleitores: ");
        double eleitores = Double.parseDouble(teclado.nextLine());
        System.out.print("DIgite o número de votos brancos: ");
        double VB = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o número de votos nulos: ");
        double VN = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o número de votos válidos: ");
        double VV = Double.parseDouble(teclado.nextLine());
        double percentVB = ((VB*100)/eleitores);
        double percentVN = ((VN*100)/eleitores);
        double percentVV = ((VV*100)/eleitores);
        System.out.printf("\nVotos brancos: %.2f%c\n", percentVB, '%');
        System.out.printf("Votos nulos: %.2f%c\n", percentVN, '%');
        System.out.printf("Votos válidos: %.2f%c", percentVV, '%');
        teclado.close();
    }
}