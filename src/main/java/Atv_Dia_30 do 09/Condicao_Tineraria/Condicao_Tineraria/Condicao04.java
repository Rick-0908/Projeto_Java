import java.util.Locale;
import java.util.Scanner;

public class Condicao04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperautra em Celsius: ");
        int n1 = sc.nextInt();
        String resultado;

        resultado = (n1 < 18) ? "Temperatura abaixo" : "Temperatura acima";
        System.out.println(resultado);
    }
}
