import java.util.Scanner;

public class Exercicio02Lista04 {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);
        System.out.print("\nDigite o nome e idade");
        System.out.print("\nNome: ");
        String name = board.nextLine();
        System.out.print("Idade: ");
        int age = Integer.parseInt(board.nextLine());
        if(age>0&&age<=12){
            System.out.printf("%s, %d anos, Pediatria", name, age);
        }
        else{
            if(age>12&&age<=59){
                System.out.printf("%s, %d anos, Clínica Geral", name, age);
            }
            else{
                if(age>=60){
                    System.out.printf("%s, %d anos, Geriatria", name, age);
                }
            }
        }
        board.close();
    }
}