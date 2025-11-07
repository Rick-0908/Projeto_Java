package Atividades_Listas_Senai.Modularização.CalculadoraDeMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMedia calc  = new CalculadoraMedia();
        System.out.println("Quantas notas você vai adicionar ?");
        calc.notasAluno = sc.nextInt();
        for (int i = 0; i < calc.notasAluno; i++) {
            System.out.println("Digite a nota do aluno: ");
            calc.soma += sc.nextDouble();
        }

        System.out.println("Deseja fazer a média ?");
        String respUsuario = sc.next();
        if (respUsuario.equalsIgnoreCase("Sim")) {
            System.out.println(calc.notasMedia());
        } else if (respUsuario.equalsIgnoreCase("Não")) {
            System.out.println("Encerrando...");
            sc.close();
        }else
            System.out.println("Digite um comando valido");
    }
}
