package While_Pratice;

import java.util.Random;
import java.util.Scanner;

public class While02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();
        // Média de temperatuda = 26
        //A medição de temperatura e por hora logo, é uma temperatura aleatoria
        int tempo = 0;
        int soma = 0;

        while (tempo <= 24){
            int temp = rand.nextInt(27);
            System.out.println("A temperatura atual é: " +temp+ " e a hora atual é: " +tempo);

            soma += temp;
            tempo ++;
        }
        System.out.println("A média de temperatura é: " +soma / 26);
        System.out.println("Sistema encerrado");


    }
}
