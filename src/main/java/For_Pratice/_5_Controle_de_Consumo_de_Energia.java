package For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _5_Controle_de_Consumo_de_Energia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int soma = 0;
        for (int maq = 1; maq <= 10; maq++){
            for (int i = 1; i < 24; i++){
                int cons = rand.nextInt(9);
                System.out.println("A hora: " +i+ " teve sua maquina: " + maq+" analisada e seu consumo foi de: " +cons);
                soma+=cons;
            }
            System.out.println("Consumo de maquina: " +maq+ " em 24 horas: " +soma);
        }
    }
}
