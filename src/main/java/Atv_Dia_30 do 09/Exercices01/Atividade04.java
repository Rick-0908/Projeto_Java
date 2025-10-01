import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        double peso1 = 3;
        double peso2 = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua 1 nota real: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua 2 nota real: ");
        double n2 = sc.nextDouble();

        double calcP = (n1 * peso1 + n2 * peso2)/peso1 + peso2;

        System.out.println("O resultado ponderado é: " +calcP);
    }
}
