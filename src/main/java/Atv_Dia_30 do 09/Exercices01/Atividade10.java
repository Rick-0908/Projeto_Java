import java.util.Locale;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        double pesoIdeal = (72.7 * altura) -58;

        System.out.printf("O peso ideal é: %.1f kg%n",pesoIdeal);

        Locale.setDefault(Locale.US);
    }
}
