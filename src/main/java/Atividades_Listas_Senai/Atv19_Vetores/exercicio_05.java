package Atividades_Listas_Senai.Atv19_Vetores;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] palavra=new String[5];

        int soma=0;

        for (int i=0 ; i<5 ; i++) {
            System.out.println("Digite a palavra");
            palavra[i]= sc.nextLine();

            palavra[i].split("");

            if (palavra[i].length()>=5) {
                soma++;
            }
        }
        System.out.println("A quantidade de palavras com mais de 5 caracteres é: "+soma);
        sc.close();
    }
}
