package While_Pratice;

import java.util.Scanner;

public class While04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();

        int estoque = 500; // O loop continuará enquanto o estoque for maior ou igual a 100

        while (estoque >= 100){ //Aqui se encontra em "false" pois o valor é menor do que o predefinido pois precisa fazer uma contagem
            System.out.println("O seu estoque atual é: " +estoque);
            estoque -=20; //Calculo para reduzir de 20 em 20 unidades o valor
        }
        System.out.println("O seu estoque final ficou em: " +estoque);
    }
}
