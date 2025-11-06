package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto e sua categoria \nExemplo: arroz:alimento");
        String respUsuario = sc.nextLine();
        String [] produtoCategoria = respUsuario.split(",");
        for (String produto : produtoCategoria) {
            String [] partes =  produto.split(":");
            if (partes.length == 2){
                String nome = partes[0];
                String categoria = partes[1];
                System.out.println("Nome: " + nome + " - Categoria: " + categoria);
            }
        }

    }
}
