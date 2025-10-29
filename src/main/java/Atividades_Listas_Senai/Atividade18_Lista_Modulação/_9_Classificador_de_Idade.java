package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _9_Classificador_de_Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Deseja verificar sua idade ?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("Sim")) {
            System.out.println("Insira sua idade");
            idade = sc.nextInt();
            ClassificadorIdade(idade);
        }else {
            System.out.println("Sistema encerrando...");
            sc.close();
        }
    }
    public static void ClassificadorIdade (int idade){
        if (idade <= 12) {
            System.out.println("Você está na idade INFANTIL");
        }else if (idade > 13 && idade <= 18) {
            System.out.println("Você está na idade da ADOLESCENCIA");
        }else if (idade > 19 && idade <= 28) {
            System.out.println("Você está na idade ADULTA");
        }else {
            System.out.println("Você passou da idade ADULTA e está entrando na idade do IDOSO");
        }
    }

}
