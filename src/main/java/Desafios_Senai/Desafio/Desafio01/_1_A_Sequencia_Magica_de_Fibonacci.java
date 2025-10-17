package Desafios_Senai.Desafio.Desafio01;

import java.util.Scanner;

public class _1_A_Sequencia_Magica_de_Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = n1 + n2, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite até qual digito saber a sequencia");
        num = sc.nextInt();

        if (num == 1) {
            System.out.println("0");
        } else if (num == 2) {
            System.out.println("0");
            System.out.println("1");
        } else {
            System.out.println("0");
            System.out.println("1");
            // Este bloco serve para imprimir os primeiros termos da sequência de Fibonacci quando o usuário pede uma sequência muito curta.


        }
        for (int i = 3; i <= num; i++) { // FOR utilizado para fazer o calculo para saber primo
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            boolean isPrime = true; // Boolean para verificar se é primo ou não
            if (n3 < 2){
                isPrime = false;
            }else{
                for (int j = 2; j < n3; j++){ // for com o calculo de % "resto de divisão" para saber se e primo
                    if (n3 % j == 0){ //Vai ser divisivel entre 2 e o numero antes ele, logo primo
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.println(n3 + "*"); // apresentação dos numeros primos com o *
            }else {
                System.out.println(n3);
            }
        }

    }
}
