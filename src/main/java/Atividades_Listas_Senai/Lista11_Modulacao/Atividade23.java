package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        int seguranca;
        String resp;
        do {
            seguranca = rand.nextInt(100);
            String resultado = verificacaoSeguranca(seguranca);
            System.out.println("=====================================================================");
            System.out.println("O Trafégo se encontra em: " + seguranca + "% " +resultado);
            System.out.println("Deseja verificar novamente (Sim/Não) ?");
            System.out.println("=====================================================================");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }
    public static String verificacaoSeguranca(int virus){
        String msg;
        if (virus >= 70 && virus <= 100){
            msg = "O tráfego está com ameaça iminente,acesso bloqueado";
        } else if (virus >= 30 && virus < 70) {
            msg = "O tráfego está suspeito,fique alerta !!!";
        }else if (virus >= 0 && virus < 30){
            msg = "O tráfego está normal";
        }else if (virus < 0 ){
            msg = "A rede está desligada";
        }else {
            msg = "Verifique novamente se seu trafego está conectado ao servidor";
        }
        return msg;
    }
}
