package While_Pratice_01.Lista01;

import java.util.Scanner;

public class While01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int x = 0;
        while (x <= 100) {
            System.out.println("A peça: "+ x + " foi contada com sucesso !");
            x += 1;
        }
        System.out.println("O sistema foi encerrado com sucesso e a contagem finalizada");

    }
}
