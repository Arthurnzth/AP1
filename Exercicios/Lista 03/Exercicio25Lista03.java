import java.util.Scanner;

public class Exercicio25Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nComplete as informações para saber o vencedor\n\n");
        System.out.print("Digite o nome do primeiro time: ");
        String time1 = teclado.nextLine();
        System.out.print("Digite o número de gols marcados pelo primeiro time: ");
        int golsT1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o nome do segundo time: ");
        String time2 = teclado.nextLine();
        System.out.print("Digite o número de gols marcados pelo segundo time: ");
        int golsT2 = Integer.parseInt(teclado.nextLine());
        if(golsT1>golsT2){
            System.out.printf("\nTime vencedor: %s", time1);
        }
        if(golsT2>golsT1){
            System.out.printf("\nTime vencedor: %s", time2);
        }
        if(golsT1==golsT2){
            System.out.print("\nEMPATE");
        }
        teclado.close();
    }
}