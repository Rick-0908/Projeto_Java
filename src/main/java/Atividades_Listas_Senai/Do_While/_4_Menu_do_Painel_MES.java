package Atividades_Listas_Senai.Do_While;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_Menu_do_Painel_MES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> opcoes = new ArrayList<>();
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Registrar parada obrigatoria - 1");
        menu.add("Registrar produção - 2");
        menu.add("Sair do menu - 3");

        int resp;
        char respOP = 'n';
        do {
            System.out.println("==========================================");
            System.out.println("Deseja qual das opções a seguir ?");
            System.out.println(menu);
            System.out.println("==========================================");
            resp = sc.nextInt();

            if (resp == 1) {
                if (menu.size() > 0 && menu.get(0).contains("1")) {
                    menu.remove(0);
                }
                opcoes.add(1);
                System.out.println("Parada obrigatória registrada!");

            } else if (resp == 2) {
                if (menu.size() > 1 && menu.get(1).contains("2")) {
                    menu.remove(1);
                } else if (menu.size() > 0 && menu.get(0).contains("2")) {
                    menu.remove(0);
                }
                opcoes.add(2);
                System.out.println("Produção registrada!");

            } else if (resp == 3) {
                System.out.println("Deseja sair mesmo do programa? (s/n)");
                respOP = sc.next().charAt(0);
                if (respOP == 's' || respOP == 'S') {
                    break;
                }
            }

            if (resp != 3) {
                System.out.println("Deseja fazer outra operação? (Sim/Não)");
                sc.nextLine();
                String resp01 = sc.nextLine();
                if (!resp01.equalsIgnoreCase("Sim")) {
                    System.out.println("Deseja encerrar? (s/n)");
                    respOP = sc.next().charAt(0);
                }
            }

        } while (respOP != 's' && respOP != 'S');

        System.out.println("Programa encerrado com sucesso");
        System.out.println("Opções escolhidas:");

        for (int opcao : opcoes) {
            if (opcao == 1) {
                System.out.println("- Registrar parada obrigatória");
            } else if (opcao == 2) {
                System.out.println("- Registrar produção");
            }
        }
    }
}