package While_Pratice;

import java.util.Random;
import java.util.Scanner;

public class While08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        int pecas = 0, falhas = 0;
        while (pecas <=9500 && falhas < 50){
            pecas += 500;
            falhas = rand.nextInt(20);
            falhas += falhas;


        }
        System.out.println("Peças verificadas: " +pecas);
        System.out.println("Número de falhas: " +falhas);
    }
}
