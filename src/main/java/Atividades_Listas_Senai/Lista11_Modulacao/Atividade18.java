package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int energia;
        String resp;
        do {
            System.out.println("=====================================================================");
            System.out.println("Digite a quantidade de energia que se encontra no seu estoque \n (Máximo até 100) ");
            System.out.println("======================================================================");
            energia = sc.nextInt();
            String resultado = calculadoraEnerg(energia);
            System.out.println("==========================================================================");
            System.out.println("A energia atual é: " + energia + " " + resultado);
            System.out.println("Deseja verificar novamente ? (Sim/Não)");
            System.out.println("==========================================================================");
            sc.nextLine();
            resp = sc.next();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==========================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==========================================================================");
        sc.close();
    }
    public static String calculadoraEnerg(int energy){
        String msg;
        if (energy >= 30 && energy < 70){
            msg = "Usar energia híbrida";
        }else if (energy < 30 && energy > 0){
            msg = "Usar rede elétrica";
        }else if (energy > 70 && energy <= 100){
            msg = "Usar energia solar";
        }else if (energy == 0){
            msg = "Energia não pode ser 0 ou menor";
        }else {
            msg = "Digite uma energia válida dentro dos padrões";
        }
        return msg;
    }
}
