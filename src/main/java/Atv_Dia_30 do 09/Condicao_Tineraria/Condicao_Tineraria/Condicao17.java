import java.util.Locale;
import java.util.Scanner;

public class Condicao17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Digite a temperatura: ");
        int n1 = sc.nextInt();

        resultado = (n1 > 30) ? "Clima está quente" : "Clima está frio";
        System.out.println(resultado);
    }
}
