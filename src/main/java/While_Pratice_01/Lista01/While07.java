package While_Pratice_01.Lista01;

import java.util.Scanner;

public class While07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int velo = 2;
        while (velo <= 1000){
            System.out.println("A velocidade atual é: " +velo);
            velo += 2;

        }
        System.out.println("Velocidade máxima atingida, programa encerrado");
    }
}
