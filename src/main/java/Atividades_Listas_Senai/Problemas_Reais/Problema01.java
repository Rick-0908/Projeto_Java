package Atividades_Listas_Senai.Problemas_Reais;

import java.util.Locale;
import java.util.Scanner;

public class Problema01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        double valor, soma;
        String resp, msg;
        do {
            System.out.println("=====================================================================");
            System.out.println("Digite o valor da sua compra: R$");
            System.out.println("=====================================================================");
            valor = sc.nextDouble();
            System.out.println("=====================================================================");
            System.out.println("Deseja aplicar o desconto (Sim/Não) ?");
            System.out.println("=====================================================================");
            sc.nextLine();
            String resposta01 = sc.nextLine();
            if (resposta01.equalsIgnoreCase("Sim")) {
                if (valor <= 200) {
                    soma = valor * 0.05;
                    System.out.println("=====================================================================");
                    System.out.println("O seu valor original é: " +valor);
                    System.out.printf("E seu desconto é: %.2f%n" ,soma);
                    System.out.println("E o valor total deu: " +  (valor - soma));
                    System.out.println("=====================================================================");
                } else if (valor > 200 && valor <= 500) {
                    soma = valor * 0.10 ;
                    System.out.println("=====================================================================");
                    System.out.println("O seu valor original é: " +valor);
                    System.out.printf("E seu desconto é: %.2f%n" ,soma);
                    System.out.println("E o valor total deu: " +  (valor - soma));
                    System.out.println("=====================================================================");
                } else if (valor > 500) {
                    soma = valor  * 0.15;
                    System.out.println("=====================================================================");
                    System.out.println("O seu valor original é: " +valor);
                    System.out.printf("E seu desconto é: %.2f%n" ,soma);
                    System.out.println("E o valor total deu: " +  (valor - soma));
                    System.out.println("=====================================================================");
                }else {
                    System.out.println("=====================================================================");
                    System.out.println("Digite um comando válido !!!");
                    System.out.println("=====================================================================");
                }
            }else {
                System.out.println("=====================================================================");
                System.out.println("Digite um comando válido");
                System.out.println("=====================================================================");
                sc.close();
            }
            System.out.println("=================================================================================");
            System.out.println("Deseja fazer novamente a verificação do seu valor com o desconto (Sim/Não) ?");
            System.out.println("=================================================================================");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema sendo encerrado...");
        System.out.println("=====================================================================");
        sc.close();
    }
}
