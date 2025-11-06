package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite as palavras");
        String pal=sc.nextLine();

        String [] palavras=pal.split(",");

        for (String abc : palavras){
            String [] letras=abc.split("");
            if (letras.length<=4){
                System.out.println(abc);
            }

        }
    }
}
