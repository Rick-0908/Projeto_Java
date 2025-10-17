import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double n1 = sc.nextDouble();
        double desc = 0.15;
        double resultado = n1 * desc;

        double resultado2 = n1 - resultado;

        System.out.printf("O valor descontado deu: R$%.2f%n" ,resultado2 );
    }
}
