package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase= sc.nextLine();

        String frase2= frase.replaceAll("[.,;!?]", "");
        String[] palavras= frase2.split("\\s+");

        for (String indice : palavras){
            System.out.println(indice);
        }
        sc.close();
    }
}
