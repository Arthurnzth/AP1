import java.util.Locale;
import java.util.Scanner;

public class Exercicio19Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nPreencha as informações abaixo para saber qual dos professores recebe salário maior\n\n");
        System.out.print("Professor mestre\n");
        System.out.print("Quantidade de horas-aula dadas: ");
        int horaAulaM = Integer.parseInt(teclado.nextLine());
        System.out.print("Valor por hora recebido: ");
        double valorHoraM = Double.parseDouble(teclado.nextLine());
        System.out.print("\nProfessor doutor\n");
        System.out.print("Quantidade de horas-aula dadas: ");
        int horaAulaD = Integer.parseInt(teclado.nextLine());
        System.out.print("Valor por hora recebido: ");
        double valorHoraD = Double.parseDouble(teclado.nextLine());
        double totalM = horaAulaM*valorHoraM;
        double totalD = horaAulaD*valorHoraD;
        if(totalD>totalM){
            System.out.print("\nO professor doutor recebe salário total maior");
        }
        else{
            System.out.print("\nO professor mestre recebe salário total maior");
        }
        teclado.close();
    }
}