import java.util.Locale;
import java.util.Scanner;

public class Condicao10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;
        System.out.println("Digite seu número para saber se é divisivel: ");
        int n1 = sc.nextInt();
        resultado = (n1 % 3 != 0) ? "Não divisivel" : "divisivel";
        System.out.println(resultado);
    }
}
