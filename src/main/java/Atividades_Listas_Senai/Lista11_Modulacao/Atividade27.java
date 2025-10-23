package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Atividade27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String resp,resp2;
        do {
            System.out.println("=====================================================================");
            System.out.println("Deseja iniciar o sistema (Sim/Não) ?");
            System.out.println("=====================================================================");
            resp = sc.nextLine();
            if (resp.equalsIgnoreCase("Sim")){
                System.out.println(aleatorizadorAlerta(sc));
            }else {
                System.out.println("=====================================================================");
                System.out.println("Sistema sendo encerrado...");
                System.out.println("=====================================================================");
                sc.close();
            }
            System.out.println("=====================================================================");
            System.out.println("Deseja fazer novamente o sistema (Sim/Não) ?");
            System.out.println("=====================================================================");
            resp2 = sc.nextLine();
        }while (resp2.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }
    public static String aleatorizadorAlerta (Scanner sc){
        String msg,resp;
        ArrayList<String> alertas = new ArrayList<>();
        alertas.add("Crítico");
        alertas.add("Moderado");
        System.out.println("O que apareceu na tela do sistema ? ");
        for (String alerta : alertas){
            System.out.println(alerta);
        }
        resp = sc.nextLine();
        if (resp.equalsIgnoreCase("Critico") || resp.equalsIgnoreCase("Crítico")){
            msg = "A linha será parada imediantamente";
        } else if (resp.equalsIgnoreCase("Moderado")) {
            msg = "A linha terá o modulo de manutenção ativado";
        }else {
            msg = "A linha está normal,e irá continuar normalmente";
        }
        return msg;
    }
}
