package Desafios_Senai.Desafio.Desafio01;

import java.util.Scanner;

public class _7_Busca_do_Divisor_Comum_Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int n1, n2, MDC;
        System.out.println("Digite 1 número inteiro positivo");
        n1 = sc.nextInt();
        System.out.println("Digite o 2 número inteiro positivo");
        n2 = sc.nextInt();
        int passo = 1;
        while (n2 != 0) { // utilização da diferença de 0 por que se for 0 o programa fecha
            int resto = n1 % n2; // uma variavel criada como resto recebendo o calculo % 'mod' por conta que vai receber oresto da divisão
            System.out.println("Passo " + passo + ": " + n1 + " % " + n2 + " = " + resto);//aqui mostra o passo para ver o MDC de n1 e n2 logo o resto
            System.out.println("Passo " + n1 + " = " + n2 + " e " + n2 + " = " + resto); //Aqui mostra o calculo do MDC
            n1 = n2; //o MDC e um numero divido pelo seu anterior logo com o resto
            n2 = resto;
            passo++; //Aqui acrescentando o passo

        }
        System.out.println("---------------------------");
        System.out.println("MDC = " + n1);
        System.out.println(n1);
        if (n1 == 0 || (n2 == 0)) ;
        System.out.println("Não pode ter o valor 0");
    }
}
