package Desafios_Senai.Desafio.Desafio01;

import java.util.Random;
import java.util.Scanner;

public class _10_Simulador_de_Jogo_de_Adivinhacao_Otimizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int tentativa = 0,soma =0;

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        char resp;
        do {
            int advinhacao = rand.nextInt(101); // fará que o sistema acione um numero aleatorio
            System.out.println("O computador escolhera um número de 1 a 100, tente advinhar !!!");
            int n1 = sc.nextInt(); // declarando o numero do usuario em inteiro para n ter problema
                do {
                    while (n1 > advinhacao) { // se o numero foi maior que o estabelecido mostrara o print abaixo
                        System.out.println("Digite um número abaixo");
                        n1 = sc.nextInt(); //PAra o WHILE funcionar sem ficar infinito ele precisa de uma leitura de texto
                        tentativa ++; //contando cada tentativa do usuario em uma variavel

                    }while (n1 < advinhacao){ // se for menor o chute ira aparecer o print abaixo
                        System.out.println("Digite um número maior");
                        n1 = sc.nextInt(); //PAra o WHILE funcionar sem ficar infinito ele precisa de uma leitura de texto
                        tentativa++; // ira novamente adicionar a tentativa em uma variavel
                    }if (n1 == advinhacao){ // Caso o usuario digite o numero correto ele acerta e mostra o print abaixo
                        System.out.println("Você acertou");
                        System.out.println("O total das suas tentativas foram: " +tentativa); // aqui mostra o total de tentativas do usuario
                    }
                } while (n1 != advinhacao); //Utilização do do WHIle, onde se a resposta dele for igual a 'n' o programa fecha
            resp = sc.next().charAt(0); // obrigatorio a utilização de uma variavel para fechar o loop com charAt para identificar o que foi digitado
        } while (resp != 'n'); // <----
    }
}
