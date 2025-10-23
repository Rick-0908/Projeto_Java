package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade04 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        String resp01, resp02;
        do {
            System.out.println("=======================================");
            System.out.println("Digite o seu nivel de acesso \n (Básico / Supervisor / Engenheiro");
            System.out.println("=======================================");
            resp01 = sc.nextLine();
            System.out.println("=======================================");
            String resultado = acesso(resp01);
            System.out.println(resultado);
            System.out.println("=======================================");
            System.out.println("Deseja conferir novamente seu acesso ?");
            System.out.println("=======================================");
            resp02 = sc.nextLine();
        } while (resp02.equalsIgnoreCase("Sim"));
        System.out.println("=======================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=======================================");
        sc.close();
    }

    public static String acesso(String poder) {
        String mensagem;
        if (poder.equalsIgnoreCase("Básico") || poder.equalsIgnoreCase("Basico")) {
            mensagem = "Nivel operador básico,acesso restrito";
        } else if (poder.equalsIgnoreCase("Supervisor")) {
            mensagem = "Nivel operador parcial,acesso parcial concedido";
        } else if (poder.equalsIgnoreCase("Engenheiro")) {
            mensagem = "Nivel operador total,acesso total ao sistema";
        } else {
            mensagem = "Digite um cargo corretamente";
        }
        return mensagem;
    }
}
