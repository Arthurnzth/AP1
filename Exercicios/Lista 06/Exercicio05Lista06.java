import java.util.Scanner;

public class Exercicio05Lista06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite dois números: \n");
        System.out.print("Primeiro número: ");
        int val1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo número: ");
        int val2 = Integer.parseInt(teclado.nextLine());
        int maior = 0, menor = 0;
        if(val1>val2){
            maior = val1;
            menor = val2;
        }
        else{
            maior = val2;
            menor = val1;
        }
        System.out.printf("\nNúmeros pares entre %d e %d: \n", menor, maior);
        teclado.close();
        for(;menor<maior;menor++){
            if(menor%2==0){
                System.out.print(menor + "\t");
            }
        }
    }
}