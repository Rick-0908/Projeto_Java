package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        String resp;
        int particulas;
        do {
            particulas = rand.nextInt(300);
            String resultado = verificacaoParticulas(particulas);
            System.out.println("=========================================================================");
            System.out.println("O Ar está com: " + particulas + " particular no AR logo: " + resultado);
            System.out.println("Deseja fazer novamente a verificação (Sim/Não)?");
            System.out.println("=========================================================================");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }

    public static String verificacaoParticulas(int ar) {
        String msg;
        if (ar >= 0 && ar <= 50) {
            msg = "O Ar está com a qualidade BOA";
        } else if (ar > 50 && ar <= 100) {
            msg = "O Ar está com a qualidade MODERADA";
        } else if (ar > 100 && ar <= 200) {
            msg = "O Ar está com a qualidade RUIM";
        } else if (ar > 200 && ar <= 300) {
            msg = "O Ar está com a qualidade CRITICA";
        } else if (ar < 0) {
            msg = "O ar não poder ser -0 ou igual a 0";
        } else {
            msg = "ERRO...";
        }
        return msg;
    }
}
