package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _6_Checagem_de_Qualidade_Amostras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        String resp;
        char resposta;
        int tentativasA = 0, tentativasR = 0;
        do {
            System.out.println("Instruções de QUALIDADE \n A=Aprovada\nR=Reprovada");
            System.out.println("Digite o caractere que foi dado da peça ao ser coletada");
            resposta = sc.next().charAt(0);
            if (resposta == 'A' || resposta == 'a') {
                System.out.println("APROVADA");
                tentativasA++;

            } else if (resposta == 'R' || resposta == 'r') {
                System.out.println("REPROVADA");
                tentativasR++;
            } else {
                System.out.println("ERRO");
                return;
            }
            System.out.println("Se deseja encerrar digite (fim)");
            System.out.println("Se não apenas aperte ENTER para recomeçar");
            sc.nextLine();
            resp = sc.nextLine();
        } while (!resp.equals("fim"));
        System.out.println("APROVADAS: " + tentativasA);
        System.out.println("REPROVADAS: " + tentativasR);
        System.out.println("FIM");
    }
}
