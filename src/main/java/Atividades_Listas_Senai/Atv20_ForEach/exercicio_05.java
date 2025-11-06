package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite todos os códigos");
        String codigos= sc.nextLine();

        String[] codVect= codigos.split(",");

        String alvo;
        char resp;

        do {
            System.out.println("Digite qual código gostaria de verificar quantas vezes aparece");
            alvo = sc.nextLine();

            int soma = 0;

            for (String indice : codVect) {
                if (indice.equalsIgnoreCase(alvo)) {
                    soma++;
                }
            }
            System.out.println("O código " + alvo + " aparece " + soma + " vezes");

            System.out.println("Deseja sair do programa? (s/n)");
            resp= sc.next().charAt(0);
            sc.nextLine();

        } while (resp!='s');

        sc.close();
    }
}
