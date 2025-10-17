package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _13_Mistura_em_Tanque_Tempo_Minimo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        int tempo = 11,soma = 0;
        char resp ;
        do {
            for (int i = 1;i <= tempo; i++){ // laço for usado para fazer a contagem dos minutos
                System.out.println("O minuto atual é: " +i);
                soma = i; // somando os minutos e armazenando eles
            }
            System.out.println("Deseja encerrar o sistema (s/n) ?");
            resp = sc.next().charAt(0);
        }while (resp != 's');
        System.out.println("Sistema encerrado");
        System.out.println("Tempo total foi de: " +soma+ " minutos");
    }
}
