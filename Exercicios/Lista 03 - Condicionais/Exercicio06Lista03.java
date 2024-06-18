import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int horas = 0, minutos = 0, segundos = 0;
        System.out.print("\nDigite um valor de tempo em segundos para saber a quantidade correspondente em horas, minutos e segundos\n\n");
        System.out.print("Digite o valor: ");
        int segundosT = Integer.parseInt(teclado.nextLine());
        minutos = (int)(segundosT/60);
        if(minutos>=60){
            while(minutos>=60){
                horas++;
                minutos -= 60;
            }
        }
        horas += (int)((segundosT%60)/60);
        segundos = (int)((segundosT%60)%60);
        System.out.printf("\nHoras: %d\nMinutos: %d\nSegundos: %d", horas, minutos, segundos);
        teclado.close();
    }
}