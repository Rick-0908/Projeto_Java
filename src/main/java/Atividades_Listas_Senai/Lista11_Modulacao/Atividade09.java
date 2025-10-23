package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==================================================");
        sc.nextLine();
        String resp;
        int defeito;
        do {
            System.out.println("==================================================");
            System.out.println("Digite o percentual de defeito do lote");
            System.out.println("==================================================");
            defeito = sc.nextInt();
            String resultado = calculador(defeito);
            System.out.println("==================================================");
            System.out.println("O porcentual é: " + defeito + "% " + resultado);
            System.out.println("Deseja fazer novamente a ánalise  ?");
            System.out.println("==================================================");
            resp = sc.next();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==================================================");
        sc.close();
    }public static String calculador(int def){
        String mensagem;
        if (def >= 10){
            mensagem = "Lote com defeito,REPROVADO";
        }else {
            mensagem = "Lote com APROVADO";
        }
        return mensagem;
    }
}
