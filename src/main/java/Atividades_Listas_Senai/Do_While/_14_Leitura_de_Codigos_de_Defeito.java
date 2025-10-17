package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _14_Leitura_de_Codigos_de_Defeito {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        String resp;
        int D01 = 0, D02 = 0, D03 = 0;


        do {
            System.out.println("Digite o código de defeito (D01 ou D02 ou D03) \n Caso desejas sair do sistema digite 'sair'");
            resp = sc.nextLine();
            if (resp.equalsIgnoreCase("D01")){ // if para armazenamento do 1 codigo de defeito
                D01++;//somando caso o usuario digite o codigo
            } else if (resp.equalsIgnoreCase("D02")) { // if para armazenamento do 2 codigo de defeito
                D02++;//somando caso o usuario digite o codigo
            } else if (resp.equalsIgnoreCase("D03")) { // if para armazenamento do 3 codigo de defeito
                D03++;//somando caso o usuario digite o codigo
            }
        }while (!resp.equalsIgnoreCase("sair"));
        System.out.println("Contagem encerrada");
        System.out.println("Defeito D01: " +D01); //mostra o total de codigos digitados pelo usuario
        System.out.println("Defeitos D02: " +D02);
        System.out.println("Defeitos D03: " +D03);
    }
}
