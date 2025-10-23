package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        int horario;
        String resp;
        do {
            horario = rand.nextInt(25 );
            String resultado = verificacaoHoras(horario);
            System.out.println("=====================================================================");
            System.out.println("A hora atual é: " +horario + " " +resultado);
            System.out.println("Deseja fazer novamente a verificação de hórario (Sim/Não)?");
            System.out.println("=====================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }
    public static String verificacaoHoras(int tempo){
        String msg;
        if (tempo >= 7 && tempo <= 12){
            msg = "O turno está na parte da manhã";
        } else if (tempo > 12 && tempo <= 18) {
            msg = "O turno está no periodo da tarde";
        } else if (tempo > 18 && tempo <= 24) {
            msg = "O turno está no periodo da noite";
        }else {
            msg = "Não temos turno de madrugada";
        }
        return msg;
    }
}
