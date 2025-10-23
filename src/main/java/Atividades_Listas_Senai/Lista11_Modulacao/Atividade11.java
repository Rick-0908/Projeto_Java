package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==================================================");
        sc.nextLine();
        int bateria;
        String resp;
        do {
            bateria = rand.nextInt(100);
            String resultado = calculadoraBat(bateria);
            System.out.println("==================================================");
            System.out.println("A bateria está em: " + bateria + "% " + resultado);
            System.out.println("Deseja refazer a verificação ?");
            System.out.println("==================================================");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==================================================");
        sc.close();
    }

    public static String calculadoraBat(int porcentagem) {
        String mensagem;
        if (porcentagem < 20) {
            mensagem = "Retorne imediatamente ao local de decolegem";
        } else if (porcentagem >= 20 && porcentagem <= 60) {
            mensagem = "Foi decidido uma rota curta";
        } else if (porcentagem >= 60 && porcentagem <= 100) {
            mensagem = "Foi decido uma rota longa";
        } else {
            mensagem = "Bateria inexistente";
        }
        return mensagem;
    }
}
