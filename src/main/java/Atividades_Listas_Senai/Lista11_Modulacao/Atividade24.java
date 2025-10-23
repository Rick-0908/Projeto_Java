package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        String resp;
        int produtos;
        do {
            System.out.println("=====================================================================");
            System.out.println("Quantos produtos está no armazem \n (ATENÇÂO !!! o maximo é de 50 unidades");
            System.out.println("=====================================================================");
            produtos = sc.nextInt();
            String resultado = verificacaoProduto(produtos);
            System.out.println("=====================================================================");
            System.out.println("O estoque está com: " +produtos + " produtos, logo: " +resultado);
            System.out.println("Deseja fazer novamente a verificação de estoque ?");
            System.out.println("=====================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }

    public static String verificacaoProduto(int quantidade) {
        String msg;
        if (quantidade > 0 && quantidade <= 10) {
            msg = "Reabasteça imediatamente o estoque";
        } else if (quantidade > 10 && quantidade <= 30) {
            msg = "Alerta de produção,em breve precisa de reabastecimento";
        } else if (quantidade > 30 && quantidade <= 50) {
            msg = "Estoque está bom";
        } else if (quantidade > 50) {
            msg = "Superlotação coloque os produtos em outro lugar";
        } else if (quantidade == 0) {
            msg = "Estoque está vazio";
        } else {
            msg = "Estoque não pode ter -1 produto ou ficar vazio";
        }
        return msg;
    }
}
