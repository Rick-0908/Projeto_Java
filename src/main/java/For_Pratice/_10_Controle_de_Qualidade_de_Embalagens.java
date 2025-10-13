package For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _10_Controle_de_Qualidade_de_Embalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int aprov = 0,qual;
        boolean def;
        for (int teste = 1; teste < 21; teste++) {
            qual = rand.nextInt(10, 20);
            System.out.println("No teste: " + teste + " foram feitas: " + qual + " embalagens");

            if (qual >= 15) {
                System.out.println("Peça" + teste + " aprovada");
                aprov++;
            }
        }
        double porcent = (double) (aprov * 100)/20;
        System.out.println("Peças aprovadas: " +aprov);
        System.out.println("Peças reprovadas: " +porcent+"%");
    }
}