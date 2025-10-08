import java.util.Locale;
import java.util.Scanner;

public class Condicao11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Digite seu número");
        int n1 = sc.nextInt();

        resultado = (n1 == 0) ? "Zero" : (n1 < 0) ? "Negativo" : "Positivo";
        System.out.println(resultado);
    }
}
