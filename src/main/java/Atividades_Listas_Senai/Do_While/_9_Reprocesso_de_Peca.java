package Atividades_Listas_Senai.Do_While;

import java.util.Random;
import java.util.Scanner;


public class _9_Reprocesso_de_Peca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        char resp;
        int tentativas = 0;
        do {
            System.out.println("Deseja começar o teste (s/n)?");
            resp = sc.next().charAt(0);
            boolean teste = true;
            if (resp == 's') {
                teste = rand.nextBoolean();
                System.out.println("Peça deu: " +teste);
                tentativas++;

            }
            System.out.println("Deseja continuar tentando (s/n) ?");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
        System.out.println("Sistema encerrado");
        System.out.println("Total de tentativas: " +tentativas);
    }
}
