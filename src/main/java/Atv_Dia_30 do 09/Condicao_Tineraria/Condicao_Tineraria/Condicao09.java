import java.util.Locale;
import java.util.Scanner;

public class Condicao09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite seu número");
        int n1 = sc.nextInt();
        System.out.println("Digite seu 2 número: ");
        int n2 = sc.nextInt();

        resultado = (n1 < n2) ? "O número 2 é maior" : "O número 1 é maior";
        System.out.println(resultado);
    }
}
