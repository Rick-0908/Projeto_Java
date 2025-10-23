package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        String resp;
        int intensidade;
        do {
            intensidade = rand.nextInt(300);
            String resultado = verificacaoIntensidade(intensidade);
            System.out.println("=====================================================================");
            System.out.println("Foi feita uma verificação na rede logo \n A rede elétrica está em: " +intensidade + "A logo: " +resultado);
            System.out.println("Deseja fazer novamente a verificação (Sim/Não)?");
            System.out.println("=====================================================================");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrado...");
        System.out.println("=====================================================================");
        sc.close();
    }
    public static String verificacaoIntensidade(int eletrica){
        String msg;
        if (eletrica >= 0 && eletrica <= 100){
            msg = "A Elétrica está com qualidade fraca";
        } else if (eletrica > 100 & eletrica <= 200) {
            msg = "A Elétrica está com qualidade média";
        } else if (eletrica > 200 && eletrica <= 300) {
            msg = "A Elétrica está com qualidade forte";
        } else if (eletrica < 0) {
            msg = "Eletrica está desligada ou está com defeito";
        }else {
            msg = "ERRO...";
        }
        return msg;
    }
}
