package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _6_Gestao_de_Estoque_de_Materiais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int soma = 0;
        int media ;

        for (int dia = 0; dia < 30; dia ++){
            System.out.println("O dia atual é: " +dia);
            int mat = rand.nextInt(700);
            System.out.println("E o total produzido no dia foi: " +mat);
            soma +=mat;
        }
        System.out.println("O total de material é: " + soma);
        media = soma/30;
        System.out.println("A media total é: " +media);
    }
}
