package For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _7_Verificacao_de_Qualidade_de_Soldagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int soma = 0;
        int media;
        for (int min = 0;min <=32;min++){
            int soldagem = rand.nextInt(40);
            System.out.println("No minuto: " +min+ " foram feitas: " +soldagem);
            soma += soldagem;
        }
        System.out.println("O total de soldas feitas em 32 minutos foram: " +soma);
        media = soma/32;
        System.out.println("A média de solta foi: " +media);
    }
}
