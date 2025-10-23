package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==========================================================================");
        sc.nextLine();
        int quantMat;
        String resp;
        do {
            System.out.println("==========================================================================");
            System.out.println("Qual a quantidade por hora de material feitas ?");
            System.out.println("==========================================================================");
            quantMat = sc.nextInt();
            String resultado = calculadoraMat(quantMat);
            System.out.println("==========================================================================");
            System.out.println("A quantidade por hora é: " + quantMat + " \n" + resultado);
            System.out.println("Deseja fazer novamente ?");
            System.out.println("==========================================================================");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==========================================================================");
        System.out.println("sistema encerrando...");
        System.out.println("==========================================================================");
        sc.close();
    }

    public static String calculadoraMat(int material) {
        String msg;
        if (material > 0 && material <= 50 ) {
            msg = "Baixo desempenho de produção";
        } else if (material > 50 && material <= 100) {
            msg = "Desempenho regular";
        } else if (material > 100 && material <= 200) {
            msg = "Desempenho ótimo";
        } else if (material <= 0) {
            msg = "Não pode ter material 0 ou menor";
        } else {
            msg = "Digite um desempenho nos padrões";
        }
        return msg;
    }
}
