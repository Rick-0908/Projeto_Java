import java.util.Locale;
import java.util.Scanner;

public class Condicao02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número INTEIRO: ");
        int n1 = sc.nextInt();
        String resultado;

        resultado = (n1 < 0) ? "Número negativo" : "Número Positivo";
        System.out.println(resultado);

    }
}
