package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==================================================");
        sc.nextLine();
        int resp01;
        String resp02;
        do {
            System.out.println("==================================================");
            System.out.println("Digite as horas de uso atual em que a maquina se encontra");
            System.out.println("==================================================");
            resp01 = sc.nextInt();
            System.out.println("==================================================");
            String resultado = horasUsos(resp01);
            System.out.println(resultado);
            System.out.println("==================================================");
            System.out.println("Deseja refazer a verificação ?");
            System.out.println("==================================================");
            resp02 = sc.nextLine();
        } while (resp02.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==================================================");
        sc.close();
    }

    public static String horasUsos(int manutencao) {
        String mensagem;
        if (manutencao < 500) {
            mensagem = "Horas de valor baixo,continue o processo";
        } else if (manutencao > 500 && manutencao < 1000) {
            mensagem = "Horas de valor médio,atenção ao uso";
        } else if (manutencao > 1000 && manutencao < 2000) {
            mensagem = "Alto valor de horas, desligue a maquina";
        } else {
            mensagem = "Digite um parametro correto";
        }
        return mensagem;
    }
}
