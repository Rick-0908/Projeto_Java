import java.util.Locale;
import java.util.Scanner;

public class Condicao13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite seu sálario: R$");
        int n1 = sc.nextInt();

        resultado = (n1 > 3000) ? "Salario alto" : "Salario baixo";
        System.out.println(resultado);
    }
}
