package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        int carga;
        String resp;
        do {
            System.out.println("=====================================================================");
            System.out.println("Insira a carga atual em que se encontra o caminhão");
            System.out.println("=====================================================================");
            carga = sc.nextInt();
            String resultado = verificacaoCargo(carga);
            System.out.println("=====================================================================");
            System.out.println("A carga atual é de: " + carga + "KG " + resultado);
            System.out.println("Deseja fazer novamente a verificação de carga (Sim/Não) ?");
            System.out.println("=====================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();

    }

    public static String verificacaoCargo(int peso) {
        String msg;
        if (peso >= 0 && peso <= 500) {
            msg = "Carga permitida,acesso liberado";
        } else if (peso > 500 && peso <= 1000) {
            msg = "Alerta de carga,retire um pouco";
        } else if (peso > 1000 && peso <= 1500) {
            msg = "Peso proibido,descarregue em outro lugar";
        } else if (peso <= 0) {
            msg = "Peso não pode ser menor ou igual a 0";
        } else {
            msg = "Digite um peso correto";
        }
        return msg;
    }
}
