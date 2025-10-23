package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int resp01;
        String resp02;
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        do {
            System.out.println("=======================================");
            System.out.println("Digite a energia em que a maquina se encontra");
            System.out.println("=======================================");
            resp01 = sc.nextInt();
            System.out.println("=======================================");
            String resultado = energias(resp01);
            System.out.println(resultado);
            System.out.println("=======================================");
            sc.nextLine();
            System.out.println("=======================================");
            System.out.println("Deseja fazer novamente ?");
            System.out.println("=======================================");
            resp02 = sc.nextLine();
        } while (resp02.equalsIgnoreCase("Sim") && resp02.equals("sim"));
        System.out.println("Sistema encerrado");
        sc.close();
    }

    public static String energias(int power) {
        String mensagem;
        if (power > 0 && power < 30) {
            mensagem = "Maquina em modo econômico";
        } else if (power >= 30 && power <= 70) {
           mensagem = "Maquina em modo normal ";
        } else if (power > 70 && power <= 100){
            mensagem = "Maquina em modo turbo";
        }else if (power <= 0){
            mensagem = "Não tem como obter energia -0, digite novamente";
        }else {
            mensagem ="Energia acima do esperado, REDUZA !!!";
        }
        return mensagem;
    }
}
