package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _4_Analise_de_Qualidade_de_Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int soma = 0 ;
        double porcent;
        boolean def;

        for (int i = 0; i < 201 ; i++ ){
            def = rand.nextBoolean();
            System.out.println("A peça: " + i + " foi verificada com sucesso");
            if (def){
                soma++;
            }
        }
        System.out.println("Peças com defeito: "+soma);
        porcent = (double) (soma*100)/200;
        System.out.println("A média de peças com defeitos é: " + porcent + " %");
    }
}
