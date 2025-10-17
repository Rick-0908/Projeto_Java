import java.util.Locale;
import java.util.Scanner;

public class Condicao12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Digite sua idade");
        int n1 = sc.nextInt();

        resultado = (n1 < 17) ? "Menor de idade" : "Maior de idade";
        System.out.println(resultado);
    }
}
