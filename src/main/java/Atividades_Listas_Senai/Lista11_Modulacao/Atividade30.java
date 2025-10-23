package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        int temperatura;
        String resp;
        do {
            System.out.println("=====================================================================");
            System.out.println("Digite a temperatura em que se localiza no painel");
            System.out.println("=====================================================================");
            temperatura = sc.nextInt();
            String resultado = verificadorTemp(temperatura);
            System.out.println("=====================================================================");
            System.out.println("A temperatura está em: " +temperatura + "° " +resultado);
            System.out.println("Deseja fazer novamente a verificação (Sim/Não) ?");
            System.out.println("=====================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }
    public static String verificadorTemp(int sensor){
        String msg;
        if (sensor >= 0 && sensor <= 60){
            msg = "Temperatura ambiente";
        } else if (sensor > 60 && sensor <= 80) {
            msg = "Resfriamento extra ativado";
        } else if (sensor > 80 && sensor <= 90) {
            msg = "Desligando os servidores por alta temperatura";
        } else if (sensor > 90) {
            msg = "Desligamento total por superaquecimento";
        }else {
            msg = "Temperatura 0 indiposnivel";
        }
        return msg;
    }
}
