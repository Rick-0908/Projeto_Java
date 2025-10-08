package While_Pratice_01.Lista01;

import java.util.Scanner;

public class While06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Cada peça, tem seu tempo reduzido de 10 em 10 segundos,logo cada interação diminui
        //Exemplo: Peça 1 em 60, Peça 1 em 50 ...
        //Cada peça deve começar com 60 segundos

        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();
        int tempc = 0;
        int soma = 0;
        int peca = 1;

        while (peca <= 10) {
            int tempo = 60; // cada peça começa com 60 segundos
            while (tempo >= 10) {
                System.out.println("A peça " + peca + " foi construída em " + tempo + " segundos");
                tempo -= 10;
            }
            peca++; // próxima peça
        }

        System.out.println("Sistema Encerrado");
    }
}