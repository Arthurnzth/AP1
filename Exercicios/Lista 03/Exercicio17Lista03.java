import java.util.Scanner;

public class Exercicio17Lista03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior = 0, menor = 0;
        System.out.print("\nInforme 5 valores inteiros\n\n");
        System.out.print("Digite o primeiro valor: ");
        int valor1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo valor: ");
        int valor2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o terceiro valor: ");
        int valor3 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o quarto valor: ");
        int valor4 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o quinto valor: ");
        int valor5 = Integer.parseInt(teclado.nextLine());
        if(valor1>=valor2){
            maior = valor1;
            menor = valor2;
            if(valor3>=valor1){
                maior = valor3;
                menor = valor2;
                if(valor4>=valor3){
                    maior = valor4;
                    menor = valor2;
                    if(valor5>=valor4){
                        maior = valor5;
                        menor = valor2;
                    }
                    else{
                        if(valor5<=valor2){
                            maior = valor4;
                            menor = valor5;
                        }
                    }
                }
                else{
                    if(valor4<=valor2){
                        maior = valor3;
                        menor = valor4;
                        if(valor5>=valor3){
                            maior = valor5;
                            menor = valor4;
                        }
                        else{
                            if(valor5<=valor4){
                                maior = valor3;
                                menor = valor5;
                            }
                        }
                    }
                }
            }
            else{
                if(valor3<=valor2){
                    maior = valor1;
                    menor = valor3;
                    if(valor4>=valor1){
                        maior = valor4;
                        menor = valor3;
                        if(valor5>=valor4){
                            maior = valor5;
                            menor = valor3;
                        }
                        else{
                            if(valor5<=valor3){
                                maior = valor4;
                                menor = valor5;
                            }
                        }
                    }
                    else{
                        if(valor4<=valor3){
                            maior = valor1;
                            menor = valor4;
                            if(valor5>=valor1){
                                maior = valor5;
                                menor = valor4;
                            }
                            else{
                                if(valor5<=valor4){
                                    maior = valor1;
                                    menor = valor5;
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            maior = valor2;
            menor = valor1;
            if(valor3>=valor2){
                maior = valor3;
                menor = valor1;
                if(valor4>=valor3){
                    maior = valor4;
                    menor = valor1;
                    if(valor5>=valor4){
                        maior = valor5;
                        menor = valor1;
                    }
                    else{
                        if(valor5<=valor1){
                            maior = valor4;
                            menor = valor5;
                        }
                    }
                }
                else{
                    if(valor4<=valor1){
                        maior = valor3;
                        menor = valor4;
                        if(valor5>=valor3){
                            maior = valor5;
                            menor = valor4;
                        }
                        else{
                            if(valor5<=valor4){
                                maior = valor3;
                                menor = valor5;
                            }
                        }
                    }
                }
            }
            else{
                if(valor3<=valor1){
                    maior = valor2;
                    menor = valor3;
                    if(valor4>=valor2){
                        maior = valor4;
                        menor = valor3;
                        if(valor5>=valor4){
                            maior = valor5;
                            menor = valor3;
                        }
                        else{
                            if(valor5<=valor3){
                                maior = valor4;
                                menor = valor5;
                            }
                        }
                    }
                    else{
                        if(valor4<=valor3){
                            maior = valor2;
                            menor = valor4;
                            if(valor5>=valor2){
                                maior = valor5;
                                menor = valor4;
                            }
                            else{
                                if(valor5<=valor4){
                                    maior = valor2;
                                    menor = valor5;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("\nMaior: %d\nMenor: %d", maior, menor);
        teclado.close();
    }
}