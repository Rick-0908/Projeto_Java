package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        String resp;
        int totalTinta;
        do {
            totalTinta = rand.nextInt(100);
            String resultado = verificacaoTinta(totalTinta);
            System.out.println("============================================================================================================");
            System.out.println("O robô pintor foi verificado \nE nele obtem uma quantidade de tinta de: " +totalTinta+ " logo: " +resultado);
            System.out.println("Deseja refazer a verificação da tinta (Sim/Não) ?");
            System.out.println("============================================================================================================");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }

    public static String verificacaoTinta(int restante) {
        String msg;
        if (restante >= 0 && restante <= 15) {
            msg = "Alerta, tinta acabando ou zerada, tintura parada";
        } else if (restante > 15 && restante <= 50) {
            msg = "Tintura em alerta,reabastecer em breve";
        } else if (restante > 50 && restante <= 70) {
            msg = "Tinta está em uma quantidade boa,manter tintura";
        } else if (restante <= 0) {
            msg = "Tintura está zerada ou tinta não pode ser -1 ";
        } else {
            msg = "ERROR...";
        }
        return msg;
    }
}
