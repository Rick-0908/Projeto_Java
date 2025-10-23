package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        String resp, resp2;
        do {
            System.out.println("=====================================================================");
            System.out.println("Deseja iniciar o sistema (Sim/Não) ?");
            System.out.println("=====================================================================");
            resp = sc.nextLine();
            if (resp.equalsIgnoreCase("Sim")) {
                System.out.println("=====================================================================");
                System.out.println(verificacaoRotas(sc));
                System.out.println("=====================================================================");
            } else {
                System.out.println("=====================================================================");
                System.out.println("Sistema sendo encerrado...");
                System.out.println("=====================================================================");
                sc.close();
            }
            System.out.println("=====================================================================");
            System.out.println("Deseja fazer novamente o sistema (Sim/Não) ?");
            System.out.println("=====================================================================");
            resp2 = sc.nextLine();
        } while (resp2.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }
    public static String verificacaoRotas(Scanner sc){
        String msg,resp;
        ArrayList<String> alertas = new ArrayList<>();
        alertas.add("Bloqueada");
        alertas.add("Transito Alto");
        alertas.add("Nenhum");
        System.out.println("O que apareceu na tela do sistema ? ");
        for (String alerta : alertas){
            System.out.println(alerta);
        }
        resp = sc.nextLine();
        if (resp.equalsIgnoreCase("Bloqueada")){
            msg = "Recalculando a rota";
        } else if (resp.equalsIgnoreCase("Transito Alto")) {
            msg = "Colocando rota alternativa no mapa";
        }else if (resp.equalsIgnoreCase("Nenhum")){
            msg = "Seguindo normalmente pela estrada";
        }else {
            msg = "Digite uma das opções válidas";
        }
        return msg;
    }
}
