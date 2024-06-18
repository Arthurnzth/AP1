import java.util.Scanner;

public class Exercicio03Lista07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite algo: ");
        String txt = teclado.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for(int j=0;j<txt.length();j++){
            if(txt.charAt(j)=='A'||txt.charAt(j)=='a'){
                a++;
            }
            if(txt.charAt(j)=='E'||txt.charAt(j)=='e'){
                e++;
            }
            if(txt.charAt(j)=='I'||txt.charAt(j)=='i'){
                i++;
            }
            if(txt.charAt(j)=='O'||txt.charAt(j)=='o'){
                o++;
            }
            if(txt.charAt(j)=='U'||txt.charAt(j)=='u'){
                u++;
            }
        }
        System.out.printf("\nNúmero de vogais no texto:\na: %d\ne: %d\ni: %d\no: %d\nu: %d", a, e, i, o, u);
        teclado.close();
    }
}