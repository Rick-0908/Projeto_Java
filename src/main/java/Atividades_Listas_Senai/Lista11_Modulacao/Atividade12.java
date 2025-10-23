package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=======================================");
        sc.nextLine();
        String resp01, resp02;
        do {
            System.out.println("=======================================");
            System.out.println("Deseja fazer a verificação de segurança?");
            System.out.println("=======================================");
            resp01 = sc.nextLine();
            System.out.println("=======================================");
            String resultado = verificacaoSeguranca(resp01, sc);
            System.out.println(resultado);
            System.out.println("=======================================");
            System.out.println("Deseja fazer novamente ?");
            resp02 = sc.nextLine();
        } while (resp02.equalsIgnoreCase("Sim"));
        System.out.println("=======================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=======================================");
        sc.close();

    }

    public static String verificacaoSeguranca(String resp01, Scanner sc) {
        String msgFinal = "";
        if (resp01.equalsIgnoreCase("Sim")) {
            System.out.println("=======================================");
            System.out.println("Você está de crachá ?");
            System.out.println("=======================================");
            String resp002 = sc.nextLine();
            if (resp002.equalsIgnoreCase("Sim")) {
                System.out.println("================================================================");
                System.out.println("Ótimo, você está de crachá,está com o capacete de segurança ?");
                System.out.println("================================================================");
                String resp02 = sc.nextLine();
                if (resp02.equalsIgnoreCase("Sim")) {
                    System.out.println("==========================================================================");
                    System.out.println("Ótimo,você está de capacete de segurança,e está dentro do seu hórario ?");
                    System.out.println("==========================================================================");
                    String resp03 = sc.nextLine();
                    if (resp03.equalsIgnoreCase("Sim")) {
                        System.out.println("=========================================================");
                        System.out.println("Ótimo, está dentro do seu hórario de turno !!!");
                        System.out.println("=========================================================");
                        msgFinal = "Acesso liberado !!!";
                    }else {
                        msgFinal = "Sistema encerrando...";
                    }

                }else {
                    msgFinal = "Sistema encerrando...";
                }
            }else {
                msgFinal = "Sistema encerrando...";
            }
        }
        else {
            msgFinal = "Sistema encerrando...";
        }
        return msgFinal;
    }
}
