package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        String resp;
        int defeitos;
        do {
            System.out.println("=====================================================================");
            System.out.println("Digite o total de defeitos: ");
            System.out.println("=====================================================================");
            defeitos = sc.nextInt();
            System.out.println("=====================================================================");
            String resultado = verificacaoDefeitos(defeitos);
            System.out.println("O total de peças com defeito é de: " +defeitos + " " +resultado);
            System.out.println("Deseja verificar novamente os defeitos (Sim/Não)");
            System.out.println("=====================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("Sistema encerrando...");
        sc.close();
    }

    public static String verificacaoDefeitos(int pecas) {
        String msg;
        if (pecas >= 0 && pecas <= 10) {
            msg = "Lote de peças aprovado";
        } else if (pecas > 10 && pecas <= 20) {
            msg = "Lote de peças será mandado para retrabalho";
        } else if (pecas > 20) {
            msg = "Lote reprovado,muita peça com defeito";
        } else {
            msg = "Digite uma quantidade correta, não é possivel ter -1 peças ";
        }
        return msg;
    }
}
