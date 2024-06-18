import java.util.Locale;
import java.util.Scanner;

public class Exercicio09Lista01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int valorV;
        System.out.print("\nInforme um número inteiro positivo para ver sua representação na base hexadecimal\n\n");
        System.out.print("Digite o valor: ");
        valorV = Integer.parseInt(teclado.nextLine());
        if(valorV<1||valorV>(2*(Math.pow(10,9)))){
            System.out.print("\nValor nao permitido.");
        }
        else{
            int resto = 0, i = 0, j;
            char[] hex = new char[8];
            while(valorV>0){
                resto = valorV%16;
                valorV = (int)valorV/16;
                if(resto==0){
                    hex[i] = '0';
                }
                else if(resto==1){
                    hex[i] = '1';
                }
                else if(resto==2){
                    hex[i] = '2';
                }
                else if(resto==3){
                    hex[i] = '3';
                }
                else if(resto==4){
                    hex[i] = '4';
                }
                else if(resto==5){
                    hex[i] = '5';
                }
                else if(resto==6){
                    hex[i] = '6';
                }
                else if(resto==7){
                    hex[i] = '7';
                }
                else if(resto==8){
                    hex[i] = '8';
                }
                else if(resto==9){
                    hex[i] = '9';
                }
                else if(resto==10){
                    hex[i] = 'A';
                }
                else if(resto==11){
                    hex[i] = 'B';
                }
                else if(resto==12){
                    hex[i] = 'C';
                }
                else if(resto==13){
                    hex[i] = 'D';
                }
                else if(resto==14){
                    hex[i] = 'E';
                }
                else if(resto==15){
                    hex[i] = 'F';
                }
                i++;
            }
            int tamanho = hex.length;
            System.out.print("\nValor em hexadecimal: ");
            for(j=tamanho-1;j>=0;j--){
                System.out.printf("%c", hex[j]);
            }
        }
        teclado.close();
    }
}